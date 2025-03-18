class Despesa extends Ativo {
    private String descricao;
    private String fonte;

    public Despesa(String descricao, String fonte, double valor) {
        super(valor, "Despesa");
        this.descricao = descricao;
        this.fonte = fonte;
    }

    public void registrarDespesa() {
        consultarAtivo();
        System.out.println("Fonte da despesa: " + fonte + " | Descrição: " + descricao);
    }
}