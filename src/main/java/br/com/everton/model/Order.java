package br.com.everton.model;

import java.util.Calendar;

/**
 * Created by everton on 11/06/17.
 */
public class Order {
    private Long id;
    private Double total;
    private Calendar orderedDate;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Calendar getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Calendar orderedDate) {
        this.orderedDate = orderedDate;
    }
}
