public class Transacao {
    private double valor;
    private String tipo;

    public Transacao() {}

    public Transacao(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public void realizarTransacao() {
        System.out.println("Realizando transação de tipo: " + tipo + " no valor de R$ " + valor);
    }
}
