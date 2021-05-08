/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocapgeminicalculadora;

import java.util.Date;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class Anuncio {
    
    private String nome;
    private Pessoas cliente;
    private Date dinicio, dfinal;
    private Investimento investimento;

    public Anuncio(String nome, Pessoas cliente, Date dinicio, Date dfinal, Investimento investimento) {
        this.nome = nome;
        this.cliente = cliente;
        this.dinicio = dinicio;
        this.dfinal = dfinal;
        this.investimento = investimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoas getCliente() {
        return cliente;
    }

    public void setCliente(Pessoas cliente) {
        this.cliente = cliente;
    }

    public Date getDinicio() {
        return dinicio;
    }

    public void setDinicio(Date dinicio) {
        this.dinicio = dinicio;
    }

    public Date getDfinal() {
        return dfinal;
    }

    public void setDfinal(Date dfinal) {
        this.dfinal = dfinal;
    }

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }
    
    
}
