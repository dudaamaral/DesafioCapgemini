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
public class Investimento {

    private double valor;

    public Investimento(double valor) {
        this.valor = valor;
    }

    public Investimento() {
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularRetorno(){
        return getValor()* 30 *40+(((((getValor() * 30 *40)*12)/100)*3)/20)*3;
       
    }  

    
    
    
}
