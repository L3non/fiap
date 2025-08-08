public class Ativo {
    private String nome;
    private String categoria;
    private double preco;

    public Ativo() {}

    public Ativo(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public void consultarAtivo() {
        System.out.println("Consultando ativo: " + nome + " da categoria " + categoria + " com preço de R$" + preco);
    }
}
