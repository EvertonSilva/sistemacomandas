package br.com.everton.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by everton on 10/06/17.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:~/tmp/data/sistemacomandas", "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
