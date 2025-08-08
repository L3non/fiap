package br.com.evofin.model;

public class InvestimentoRendimento {
    private int idRendimento;
    private double rendimentoPorcentagem;
    private double rendimentoValor;

    public InvestimentoRendimento() {}

    public InvestimentoRendimento(int idRendimento, double rendimentoPorcentagem, double rendimentoValor) {
        this.idRendimento = idRendimento;
        this.rendimentoPorcentagem = rendimentoPorcentagem;
        this.rendimentoValor = rendimentoValor;
    }

    public int getIdRendimento() { return idRendimento; }
    public void setIdRendimento(int idRendimento) { this.idRendimento = idRendimento; }

    public double getRendimentoPorcentagem() { return rendimentoPorcentagem; }
    public void setRendimentoPorcentagem(double rendimentoPorcentagem) { this.rendimentoPorcentagem = rendimentoPorcentagem; }

    public double getRendimentoValor() { return rendimentoValor; }
    public void setRendimentoValor(double rendimentoValor) { this.rendimentoValor = rendimentoValor; }
}
