/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios.model;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class PessoaModel {
    
    private String nome;
    private String ip;

    public PessoaModel(String nome, String ip) {
        this.nome = nome;
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public void visualizar(){
        System.out.println("Cliente visualizou o anúncio");
    }
    
    public void clicar(){
        System.out.println("Cliente clicou no anúncio");
    }
    
    public void compartilhar(){
        System.out.println("Cliente compartilhou o anúncio");
    }
}
