package br.com.everton.persistence;

import br.com.everton.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by everton on 10/06/17.
 */
public class ConnectionFactory {

    private final String DBURL;

    public ConnectionFactory() {
        DbConfig dbconfig = new DbConfig();
        DBURL = dbconfig.getDBUrl();
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DBURL, "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
