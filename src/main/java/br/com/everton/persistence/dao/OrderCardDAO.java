package br.com.everton.persistence.dao;

import br.com.everton.model.OrdersCard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by everton on 21/06/17.
 */
public class OrderCardDAO extends AbstractDAO {

    public OrderCardDAO() {
        super.openConnection();
    }

    public OrdersCard getOrderCard(String barcode) {
        OrdersCard ordersCard = new OrdersCard();
        String sql = "select * from order_cards where barcode = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, barcode);
            ResultSet result = stmt.executeQuery();

            if(result.first()) {
                ordersCard.setId(result.getLong("id"));
                ordersCard.setBarcode(result.getString("barcode"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ordersCard;
    }
}
