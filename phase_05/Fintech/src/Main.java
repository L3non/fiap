public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João Silva", "joao@email.com", "123.456.789-00", "(11) 98765-4321");
        Conta conta = new Conta("12345-6", 1000.50);
        Transacao transacao = new Transacao(200.75, "Transferência");
        Investimento investimento = new Investimento("Renda Fixa", 5000.00);
        Ativo ativo = new Ativo("Ação XYZ", "Renda Variável", 45.30);

        usuario.atualizarPerfil();
        conta.consultarSaldo();
        transacao.realizarTransacao();
        investimento.aplicarInvestimento();
        ativo.consultarAtivo();
    }
}