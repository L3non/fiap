package br.com.evofin;

import br.com.evofin.dao.DespesasDAO;
import br.com.evofin.model.Despesas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//187.8.12.142:1521/orcl", "usuario", "senha");

            Despesas despesa = new Despesas();
            despesa.setIdTipo(1);
            despesa.setDespesaNome("Transporte");
            despesa.setDespesaDescricao("Ônibus mensal");
            despesa.setDespesaValor(200.50);
            despesa.setDespesaData(Date.valueOf("2025-04-22"));
            despesa.setIdUser(1);

            DespesasDAO dao = new DespesasDAO(conn);
            dao.inserir(despesa);

            List<Despesas> lista = dao.listar();
            for (Despesas d : lista) {
                System.out.println(d.getDespesaNome() + ": R$" + d.getDespesaValor());
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
