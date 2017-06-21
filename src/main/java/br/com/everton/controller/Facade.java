package br.com.everton.controller;

import br.com.everton.model.OrdersCard;
import br.com.everton.model.order.Product;
import br.com.everton.persistence.dao.OrderCardDAO;
import br.com.everton.persistence.dao.ProductDAO;

/**
 * Created by everton on 21/06/17.
 */
public class Facade implements IFacade {

    private ProductDAO daoProd;
    private OrderCardDAO orderCardDAO;

    public Facade() {
        daoProd = new ProductDAO();
        orderCardDAO = new OrderCardDAO();
    }

    public OrdersCard findOrdersCard(String ordersCardNumber) {
        OrdersCard ordersCard = orderCardDAO.getOrderCard(ordersCardNumber);
        orderCardDAO.closeConnection();
        return ordersCard;
    }

    public Product findProduct(Long id) {
        Product prod = daoProd.getProduct(id);
        daoProd.closeConnection();
        return prod;
    }
}
