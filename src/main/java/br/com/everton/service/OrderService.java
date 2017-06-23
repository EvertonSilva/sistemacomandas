package br.com.everton.service;

import br.com.everton.model.OrdersCard;
import br.com.everton.model.order.Merchandise;
import br.com.everton.model.order.Order;
import br.com.everton.persistence.dao.OrderDao;
import br.com.everton.persistence.dao.OrdersCardDao;
import br.com.everton.persistence.dao.ProductDao;

/**
 * Created by everton on 23/06/17.
 */
public class OrderService implements IOrderService {

    private OrderDao orderDao;
    private OrdersCardDao ordersCardDao;
    private ProductDao productDao;

    public OrderService() {
        orderDao = new OrderDao();
        ordersCardDao = new OrdersCardDao();
        productDao = new ProductDao();
    }

    public String findOrdersCard(String barcode) {
        return "";
    }
}
