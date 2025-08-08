package br.com.finevo.model;

import br.com.finevo.util.EncryptionUtils;

public class User {

    private String email;
    private String password;

    public User(String email, String password) {
        super();
        this.email = email;
        setPassword(password);
    }

    public User() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            this.password = EncryptionUtils.encrypt(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}