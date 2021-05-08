/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocapgeminicalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class CalculadoraAnuncio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Instanciando a classe investimento para receber valor
        Investimento investimento = new Investimento();
        
        //Ler o valor que cliente esta investindo
        String valorRecebido = JOptionPane.showInputDialog("Digite o valor que deseja investir em R$: ");
        
        //Gravando o valor recebido
        double valorConvertido = Double.parseDouble(valorRecebido);
        validarValor(valorConvertido, investimento);
        
        //Cálculo do valor investido em reais
        double valorRetornado = investimento.calcularRetorno();
        
        JOptionPane.showMessageDialog(null, 
                "Quantidade de pessoas que visualizarão o anúncio: "+String.valueOf(valorRetornado));
    
    }  
    public static void validarValor(double valorRecebido, Investimento investimento){
        if(valorRecebido<=0){
           JOptionPane.showInputDialog(null,"Digite o valor que deseja investir acima de R$0,00: ");
        }
        else{
            investimento.setValor(valorRecebido);
        }
    }
}
