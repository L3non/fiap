package bruno.fintech;

public class Investimento extends Ativo {
    private String nome;
    private String categoria;

    public Investimento(String nome, String categoria, double valor) {
        super(valor, "bruno.fintech.Investimento");
        this.nome = nome;
        this.categoria = categoria;
    }

    public void aplicarInvestimento() {
        consultarAtivo();
        System.out.println("Aplicando investimento: " + nome + " | Categoria: " + categoria);
    }
}