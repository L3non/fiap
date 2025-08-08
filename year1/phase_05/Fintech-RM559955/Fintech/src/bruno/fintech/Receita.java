package bruno.fintech;

public class Receita extends Ativo {
    private String fonte;
    private String descricao;

    public Receita(String fonte, String descricao, double valor) {
        super(valor, "bruno.fintech.Receita");
        this.fonte = fonte;
        this.descricao = descricao;
    }

    public void registrarReceita() {
        consultarAtivo();
        System.out.println("Fonte da receita: " + fonte + " | Descrição: " + descricao);
    }
}