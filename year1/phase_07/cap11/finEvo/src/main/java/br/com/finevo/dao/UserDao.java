package br.com.finevo.dao;

import br.com.finevo.model.User;

public interface UserDao {
    boolean register(User user);
    boolean validate(User user);
}
