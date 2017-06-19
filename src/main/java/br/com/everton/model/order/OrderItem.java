package br.com.everton.model.order;

import br.com.everton.model.DomainEntity;

import java.math.BigDecimal;

/**
 * This class represents an item from
 * a given order.
 */
public class OrderItem extends DomainEntity {

    /**
     * Amount of item in a order
     */
    private Integer amount;

    /**
     * Sum of all items price
     */
    private BigDecimal subtotal;

    /**
     * Product being bought
     */
    private Merchandise merchandise;

    public OrderItem() {
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }
}
