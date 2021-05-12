/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class InvestimentoModel {
    
    private double valor;

    public InvestimentoModel(double valor) {
        this.valor = valor;
    }

    public InvestimentoModel() {
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularRetorno(){
        return getValor()*30;
       
    }  
}
