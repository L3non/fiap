package br.com.finevo.dao;

import br.com.finevo.model.User;

public interface UserDao {

    boolean validateUser(User user);

}