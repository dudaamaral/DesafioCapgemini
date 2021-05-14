/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios.dao;

import cadastrodeanuncios.pages.Anuncio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class ConexaoDB {

    
    public ConexaoDB() {
    }
    
    public Connection conectar(){
        Connection connection = null;
        connection = new GeraConexao().getConnection();
        System.out.println("Conexão aberta!");
        return connection;
    }
    
    public class GeraConexao{
     public Connection getConnection() {
		 try {
                    return DriverManager.getConnection("jdbc:mysql://localhost/divulgatudo","root","root");
		 }         
		 catch(SQLException excecao) {
                    throw new RuntimeException(excecao);
		 }
     }
     
     public void fechar(Connection connection){
         try {
             connection.close();
         } catch (SQLException ex) {
             Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
}
