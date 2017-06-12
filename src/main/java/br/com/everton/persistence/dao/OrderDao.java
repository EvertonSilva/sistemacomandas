package br.com.everton.persistence.dao;

import br.com.everton.model.Order;
import br.com.everton.persistence.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Created by everton on 11/06/17.
 */
public class OrderDao {
    private Connection conn;

    public OrderDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void insert(Order order) {
        // sql string
        String sql = "insert into orders " +
                "(total, dateOrdered, createdAt, updatedAt)" +
                "values (?,?,?,?)";

        try {
            // statment to run query
            PreparedStatement stmt = conn.prepareStatement(sql);

            // set values
            stmt.setDouble(1, order.getTotal());
            stmt.setDate(2, new Date(order.getOrderedDate().getTimeInMillis()));
            stmt.setDate(3, new Date(Calendar.getInstance().getTimeInMillis()));
            stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));

            // execute query
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
