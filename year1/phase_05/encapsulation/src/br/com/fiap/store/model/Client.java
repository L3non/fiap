package br.com.fiap.store.model;

public class Client {
    protected String name;
    protected String cpf;
    protected boolean active;

    public void showData() {
        System.out.println(name + " " + cpf + " " + formatData());
    }

    private String formatData() {
        if (active) {
            return "Active";
        } else {
            return "Inactive";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
