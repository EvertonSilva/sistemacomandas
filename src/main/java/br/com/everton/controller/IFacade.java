package br.com.everton.controller;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.order.Product;

/**
 * Created by everton on 21/06/17.
 */
public interface IFacade {

    Product findProduct(Long id);
}
