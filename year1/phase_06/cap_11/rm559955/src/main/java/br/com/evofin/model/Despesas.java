package br.com.evofin.model;

import java.sql.Date;

public class Despesas {
    private int idDespesa;
    private int idTipo;
    private String despesaNome;
    private String despesaDescricao;
    private double despesaValor;
    private Date despesaData;
    private int idUser;

    public Despesas() {
    }

    // Getters e Setters
    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDespesaNome() {
        return despesaNome;
    }

    public void setDespesaNome(String despesaNome) {
        this.despesaNome = despesaNome;
    }

    public String getDespesaDescricao() {
        return despesaDescricao;
    }

    public void setDespesaDescricao(String despesaDescricao) {
        this.despesaDescricao = despesaDescricao;
    }

    public double getDespesaValor() {
        return despesaValor;
    }

    public void setDespesaValor(double despesaValor) {
        this.despesaValor = despesaValor;
    }

    public Date getDespesaData() {
        return despesaData;
    }

    public void setDespesaData(Date despesaData) {
        this.despesaData = despesaData;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
