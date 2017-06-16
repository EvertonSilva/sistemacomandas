package br.com.everton.model;

/**
 * This class represents a "comanda"
 * A card to control orders in bars and restaurants
 *
 */
public class OrdersCard  extends DomainEntity {

    /**
     * Custom barcode to identify the card
     *
     */
    private String barcode;

    /**
     * Current open order
     *
     */
    private Order order;

    public OrdersCard() {
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
