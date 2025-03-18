//private: pode ser acessado somente pela própria classe
//public: pode ser acessado por qualquer outra classe
//default (sem o modificador): pode ser acessado por qualquer classe que esteja no mesmo pacote
//protected: pode ser acessado por qualquer classe do mesmo pacote da classe ou por qualquer classe que herde da classe

import br.com.fiap.store.model.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Thiago");
        client.showData();
        System.out.println(client.getName());
    }
}