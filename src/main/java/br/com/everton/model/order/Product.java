package br.com.everton.model.order;

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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
