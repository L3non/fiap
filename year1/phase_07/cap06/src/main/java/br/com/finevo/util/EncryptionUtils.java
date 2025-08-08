package br.com.finevo.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtils {

    public static String encrypt(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // Obtém a instância de um algoritmo
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Passa os dados a serem criptografados e estipula encoding padrão
        md.update(password.getBytes("ISO-8859-1"));

        // Gera a chave criptografada em array de Bytes para posterior hashing
        BigInteger hash= new BigInteger(1, md.digest());

        // Retorna a senha criptografada
        return hash.toString(16);
    }

}