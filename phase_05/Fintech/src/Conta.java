public class Conta {
    private int numero;
    private double saldo;

    public Conta() {}

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Consultando saldo da conta: " + numero);
    }
}
