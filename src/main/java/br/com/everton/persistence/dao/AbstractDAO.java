package br.com.everton.persistence.dao;

import br.com.everton.persistence.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by everton on 21/06/17.
 */
public abstract class AbstractDAO {
    protected Connection conn;

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void openConnection() {
        conn = new ConnectionFactory().getConnection();
    }
}
