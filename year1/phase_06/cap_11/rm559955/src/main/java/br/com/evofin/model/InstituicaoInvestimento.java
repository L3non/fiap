package br.com.evofin.model;

public class InstituicaoInvestimento {
    private int idInstituicao;
    private String nomeInstituicao;

    public InstituicaoInvestimento() {}

    public InstituicaoInvestimento(int idInstituicao, String nomeInstituicao) {
        this.idInstituicao = idInstituicao;
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getIdInstituicao() { return idInstituicao; }
    public void setIdInstituicao(int idInstituicao) { this.idInstituicao = idInstituicao; }

    public String getNomeInstituicao() { return nomeInstituicao; }
    public void setNomeInstituicao(String nomeInstituicao) { this.nomeInstituicao = nomeInstituicao; }
}
