package br.com.everton.persistence.dao;

import br.com.everton.model.Order;
import br.com.everton.persistence.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by everton on 11/06/17.
 */
public class OrderDao {
    private Connection conn;

    public OrderDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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

    public List<Order> getList() {
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from orders");
            ResultSet result = stmt.executeQuery();
            List<Order> orders = new ArrayList<>();
            Calendar date = Calendar.getInstance();

            while(result.next()) {
                Order order = new Order();
                // set date
                date.setTime(result.getDate("dateOrdered"));
                order.setOrderedDate(date);
                // set id
                order.setId(result.getLong("id"));
                // set total
                order.setTotal(result.getDouble("total"));

                orders.add(order);
            }

            result.close();
            stmt.close();

            return orders;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
