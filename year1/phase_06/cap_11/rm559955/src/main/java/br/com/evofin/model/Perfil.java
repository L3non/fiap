package br.com.evofin.model;

public class Perfil {
    private int idPerfil;
    private String objetivoPrevio;
    private String investimentosDeInteresse;
    private String objetivo;
    private double valor;
    private String objetivoDesc;
    private String perfilEscolhido;

    public Perfil() {}

    public Perfil(int idPerfil, String objetivoPrevio, String investimentosDeInteresse, String objetivo, double valor, String objetivoDesc, String perfilEscolhido) {
        this.idPerfil = idPerfil;
        this.objetivoPrevio = objetivoPrevio;
        this.investimentosDeInteresse = investimentosDeInteresse;
        this.objetivo = objetivo;
        this.valor = valor;
        this.objetivoDesc = objetivoDesc;
        this.perfilEscolhido = perfilEscolhido;
    }

    public int getIdPerfil() { return idPerfil; }
    public void setIdPerfil(int idPerfil) { this.idPerfil = idPerfil; }

    public String getObjetivoPrevio() { return objetivoPrevio; }
    public void setObjetivoPrevio(String objetivoPrevio) { this.objetivoPrevio = objetivoPrevio; }

    public String getInvestimentosDeInteresse() { return investimentosDeInteresse; }
    public void setInvestimentosDeInteresse(String investimentosDeInteresse) { this.investimentosDeInteresse = investimentosDeInteresse; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getObjetivoDesc() { return objetivoDesc; }
    public void setObjetivoDesc(String objetivoDesc) { this.objetivoDesc = objetivoDesc; }

    public String getPerfilEscolhido() { return perfilEscolhido; }
    public void setPerfilEscolhido(String perfilEscolhido) { this.perfilEscolhido = perfilEscolhido; }
}
