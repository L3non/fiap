package br.com.evofin.model;

import java.util.Date;

public class Investimento {
    private int idInvestimento;
    private int idUser;
    private int idTipoInvestimento;
    private int idInstituicao;
    private double investimentoValor;
    private Date investimentoDataAplicacao;
    private int idRendimento;

    public Investimento() {}

    public Investimento(int idInvestimento, int idUser, int idTipoInvestimento, int idInstituicao, double investimentoValor, Date investimentoDataAplicacao, int idRendimento) {
        this.idInvestimento = idInvestimento;
        this.idUser = idUser;
        this.idTipoInvestimento = idTipoInvestimento;
        this.idInstituicao = idInstituicao;
        this.investimentoValor = investimentoValor;
        this.investimentoDataAplicacao = investimentoDataAplicacao;
        this.idRendimento = idRendimento;
    }

    public int getIdInvestimento() { return idInvestimento; }
    public void setIdInvestimento(int idInvestimento) { this.idInvestimento = idInvestimento; }

    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }

    public int getIdTipoInvestimento() { return idTipoInvestimento; }
    public void setIdTipoInvestimento(int idTipoInvestimento) { this.idTipoInvestimento = idTipoInvestimento; }

    public int getIdInstituicao() { return idInstituicao; }
    public void setIdInstituicao(int idInstituicao) { this.idInstituicao = idInstituicao; }

    public double getInvestimentoValor() { return investimentoValor; }
    public void setInvestimentoValor(double investimentoValor) { this.investimentoValor = investimentoValor; }

    public Date getInvestimentoDataAplicacao() { return investimentoDataAplicacao; }
    public void setInvestimentoDataAplicacao(Date investimentoDataAplicacao) { this.investimentoDataAplicacao = investimentoDataAplicacao; }

    public int getIdRendimento() { return idRendimento; }
    public void setIdRendimento(int idRendimento) { this.idRendimento = idRendimento; }
}
