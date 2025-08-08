public class Conta {
    private String numero;
    private double saldo;

    public Conta() {}

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Consultando saldo da conta: " + numero);
    }
}
