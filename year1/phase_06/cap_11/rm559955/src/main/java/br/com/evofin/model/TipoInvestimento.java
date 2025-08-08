package br.com.evofin.model;

public class TipoInvestimento {
    private int idTipoInvestimento;
    private String tipoInvestimento;

    public TipoInvestimento() {}

    public TipoInvestimento(int idTipoInvestimento, String tipoInvestimento) {
        this.idTipoInvestimento = idTipoInvestimento;
        this.tipoInvestimento = tipoInvestimento;
    }

    public int getIdTipoInvestimento() { return idTipoInvestimento; }
    public void setIdTipoInvestimento(int idTipoInvestimento) { this.idTipoInvestimento = idTipoInvestimento; }

    public String getTipoInvestimento() { return tipoInvestimento; }
    public void setTipoInvestimento(String tipoInvestimento) { this.tipoInvestimento = tipoInvestimento; }
}
