package br.com.everton.controller;

import br.com.everton.model.order.Product;
import br.com.everton.persistence.dao.ProductDAO;

/**
 * Created by everton on 21/06/17.
 */
public class Facade implements IFacade {

    private ProductDAO daoProd;

    public Facade() {
        daoProd = new ProductDAO();
    }

    @Override
    public Product findProduct(Long id) {
        Product prod = daoProd.getProduct(id);
        daoProd.closeConn();
        return prod;
    }
}
