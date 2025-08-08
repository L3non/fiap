package br.com.finevo.test;

import br.com.finevo.util.EncryptionUtils;

public class EncryptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(EncryptionUtils.encrypt("123456"));
            System.out.println(EncryptionUtils.encrypt("123456"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}