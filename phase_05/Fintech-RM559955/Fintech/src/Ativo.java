abstract class Ativo {
    private double valor;
    private String tipo;

    public Ativo(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() { return valor; }
    public String getTipo() { return tipo; }

    public void consultarAtivo() {
        System.out.println("Ativo do tipo: " + tipo + " | Valor: R$" + valor);
    }
}