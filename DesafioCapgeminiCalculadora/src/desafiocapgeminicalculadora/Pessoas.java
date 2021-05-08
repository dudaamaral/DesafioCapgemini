/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocapgeminicalculadora;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class Pessoas {
    
    private String nome;
    private int ip;

    public Pessoas(String nome, int ip) {
        this.nome = nome;
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
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
