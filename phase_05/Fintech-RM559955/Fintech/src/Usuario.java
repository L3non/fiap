class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public Usuario(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void atualizarPerfil() {
        System.out.println("Perfil do usuário atualizado: " + nome);
    }
}