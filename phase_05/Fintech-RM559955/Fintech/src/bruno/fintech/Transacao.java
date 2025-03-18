package bruno.fintech;

public class Transacao {
    private double valor;
    private String tipo;

    public Transacao(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public void realizarTransacao() {
        System.out.println("Transação realizada: " + tipo + " | Valor: R$" + valor);
    }
}
