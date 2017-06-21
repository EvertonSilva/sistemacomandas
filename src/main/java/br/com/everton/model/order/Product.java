package br.com.everton.model.order;

import java.math.BigDecimal;

/**
 * This class represents a industrialized product
 *
 */
public class Product  extends Merchandise {

    /**
     * Product barcode
     */
    private String barcode;

    public Product() {
    }

    public Long getId() {
        return super.id;
    }

    public void setId(Long id) {
        super.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public BigDecimal getPrice() {
        return super.price;
    }

    public void setPrice(BigDecimal price) {
        super.price = price;
    }
}
