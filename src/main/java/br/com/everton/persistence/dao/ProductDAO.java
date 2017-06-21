package br.com.everton.persistence.dao;

import br.com.everton.model.order.Product;
import br.com.everton.persistence.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by everton on 21/06/17.
 */
public class ProductDAO extends AbstractDAO {

    public ProductDAO() {
        super.openConnection();
    }

    public Product getProduct(Long id) {
        Product prod;
        String sql = "select * from products where id = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet result = stmt.executeQuery();
            prod = new Product();

            if(result.first()) {
                prod.setId(result.getLong("id"));
                prod.setName(result.getString("name"));
                prod.setPrice(result.getBigDecimal("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return prod;
    }
}
