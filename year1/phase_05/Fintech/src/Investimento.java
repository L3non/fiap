public class Investimento {
    private String tipo;
    private double valor;

    public Investimento() {}

    public Investimento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void aplicarInvestimento() {
        System.out.println("Aplicando investimento de tipo: " + tipo + " no valor de R$" + valor);
    }
}
