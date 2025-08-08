package br.com.finevo.factory;

import br.com.finevo.dao.CategoryDao;
import br.com.finevo.dao.ProductDao;
import br.com.finevo.dao.UserDao;
import br.com.finevo.dao.impl.OracleCategoryDao;
import br.com.finevo.dao.impl.OracleProductDao;
import br.com.finevo.dao.impl.OracleUserDao;

public class DaoFactory {
    public static ProductDao getProductDao() {
        return new OracleProductDao();
    }

    public static CategoryDao getCategoryDao() {
        return new OracleCategoryDao();
    }

    public static UserDao getUserDao() {
        return new OracleUserDao();
    }
}
