package br.com.everton.model.order;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.OrdersCard;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * This class represents a Order
 *
 */
public class Order extends DomainEntity {

    /**
     * An OrderCard to hold an opened order
     */
    private OrdersCard card;

    /**
     * List of items ordered
     */
    private List<OrderItem> orderList;

    /**
     * Order total amount bill
     */
    private BigDecimal totalAmount;

    /**
     * Order date and time
     */
    private Calendar orderedDate;

    /**
     * Order status
     */
    private Status status;

    public Order() {
    }

    public Long getId() {
        return super.id;
    }

    public void setId(Long id) {
        super.id = id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Calendar getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Calendar orderedDate) {
        this.orderedDate = orderedDate;
    }

    public void includeItem(OrderItem item) {
        this.orderList.add(item);
    }

    public void removeItem(OrderItem item) {
        if(orderList.contains(item)) {
            orderList.remove(item);
        }
    }
}
