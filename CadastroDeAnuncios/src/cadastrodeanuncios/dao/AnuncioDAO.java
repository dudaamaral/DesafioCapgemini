/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios.dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class AnuncioDAO {
    
    private Connection conexao;   
      
    public void criarAnuncio(AnuncioModel anuncio){
       conexao = new ConexaoDB().conectar();
        try { 
            String sqlPessoa = "INSERT INTO pessoas(nome, ip) VALUES(?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sqlPessoa);
            stmt.setString(1, anuncio.getCliente().getNome());
            stmt.setString(2, anuncio.getCliente().getIp());
            stmt.executeUpdate();
            
            String sqlInvestimento = "INSERT INTO investimentos(valor) VALUES(?)";
            stmt = conexao.prepareStatement(sqlInvestimento);
            stmt.setDouble(1, anuncio.getInvestimento().getValor());
            stmt.executeUpdate();
            
            String sqlAnuncio = "INSERT INTO anuncios(nome, dataInicio, dataFinal, fk_pessoa, fk_investimento) VALUES (?,?,?,LAST_INSERT_ID(),LAST_INSERT_ID())";
            stmt = conexao.prepareStatement(sqlAnuncio);      
            stmt.setString(1, anuncio.getNome()); 
            stmt.setDate(2, new java.sql.Date(anuncio.getDinicio().getTime()));
            stmt.setDate(3, new java.sql.Date(anuncio.getDfinal().getTime()));
            stmt.executeUpdate();
            
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
        } 
    public Object consultarAnuncio(AnuncioModel anuncio){
        conexao = new ConexaoDB().conectar();
        ResultSet resultado = null;
        Object valorRetornado = null;
        String sqlRelatorio = "SELECT DISTINCT SUM(valor) as valor " +
            "FROM anuncios " +
            "INNER JOIN investimentos " +
            "ON anuncios.fk_investimento = investimentos.id " +
            "INNER JOIN pessoas " +
            "ON anuncios.fk_pessoa = pessoas.id " +
            "WHERE 1=1 ";
            if(anuncio.getDinicio() != null){
                sqlRelatorio = sqlRelatorio + " AND dataInicio >= " + new java.sql.Date(anuncio.getDinicio().getTime());
            }
            
            if(anuncio.getDfinal() != null){
                sqlRelatorio = sqlRelatorio + " AND dataFinal <= " + new java.sql.Date(anuncio.getDfinal().getTime());
            }
            
            if(anuncio.getCliente() != null && !anuncio.getCliente().getNome().equals("")){
                sqlRelatorio = sqlRelatorio + " AND pessoas.nome = '" + anuncio.getCliente().getNome() + "'"; 
            }
            PreparedStatement stmt;
            try {
                stmt = conexao.prepareStatement(sqlRelatorio);
                resultado = stmt.executeQuery();
                valorRetornado = validaRetorno(resultado);
                
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(AnuncioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return valorRetornado;
    }
    private Object validaRetorno(ResultSet resultado) throws SQLException{ 
        if(resultado == null || resultado.next() == false){               
            JOptionPane.showMessageDialog(null,"Consulta não retornou resultado.");

            return null;
        }  
        return resultado.getObject("valor");
    }
}
