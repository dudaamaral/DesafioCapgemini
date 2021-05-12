/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeanuncios;

import java.util.Date;

/**
 *
 * @author Eduarda Amaral - carmoduda6@gmail.com
 */
public class AnuncioModel {
    
    private String nome;
    private PessoasModel cliente;
    private Date dinicio, dfinal;
    private InvestimentoModel investimento;

    public AnuncioModel(String nome, PessoasModel cliente, Date dinicio, Date dfinal, InvestimentoModel investimento) {
        this.nome = nome;
        this.cliente = cliente;
        this.dinicio = dinicio;
        this.dfinal = dfinal;
        this.investimento = investimento;
    }

    public AnuncioModel() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PessoasModel getCliente() {
        return cliente;
    }

    public void setCliente(PessoasModel cliente) {
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

    public InvestimentoModel getInvestimento() {
        return investimento;
    }

    public void setInvestimento(InvestimentoModel investimento) {
        this.investimento = investimento;
    }
    
}
