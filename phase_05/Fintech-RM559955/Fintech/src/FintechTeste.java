public class FintechTeste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João Silva", "joao@email.com", "(11) 98765-4321", "123.456.789-00");

        // Cria uma conta e realiza transações
        Conta conta = new Conta("12345-6", 1000.50);
        conta.consultarSaldo();
        conta.depositar(500);
        conta.sacar(200);

        // Cria transações
        Transacao transacao = new Transacao(200.75, "Transferência");
        transacao.realizarTransacao();

        // Cria ativos
        Investimento investimento = new Investimento("Ações XYZ", "Renda Variável", 5000.00);
        Receita salario = new Receita("Salário", "Pagamento mensal", 3000.00);
        Despesa despesa = new Despesa("Aluguel", "Moradia", 1200.00);

        // Aplica os métodos
        investimento.aplicarInvestimento();
        salario.registrarReceita();
        despesa.registrarDespesa();

        // Atualiza o perfil
        usuario.atualizarPerfil();
    }
}