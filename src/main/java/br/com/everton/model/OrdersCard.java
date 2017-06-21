package br.com.everton.model;

import br.com.everton.model.order.Order;

/**
 * This class represents a "comanda"
 * A card to control orders in bars and restaurants
 *
 */
public class OrdersCard  extends DomainEntity {

    /**
     * Custom barcode to identify the card
     */
    private String barcode;

    /**
     * Current open order
     */
    private Order order;

    public OrdersCard() {
    }

    public void setId(long id) {
        super.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
