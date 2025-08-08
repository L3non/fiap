package br.com.evofin.model;

import java.util.Date;

public class Receita {
    private int id;
    private String nome;
    private double valor;
    private Date dataRecebimento;
    private String descricao;
    private int idTipo;
    private int idUser;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public Date getDataRecebimento() { return dataRecebimento; }
    public void setDataRecebimento(Date dataRecebimento) { this.dataRecebimento = dataRecebimento; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getIdTipo() { return idTipo; }
    public void setIdTipo(int idTipo) { this.idTipo = idTipo; }

    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }
}

