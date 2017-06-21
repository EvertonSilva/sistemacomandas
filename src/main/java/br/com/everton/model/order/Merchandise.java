package br.com.everton.model.order;

import br.com.everton.model.DomainEntity;

import java.math.BigDecimal;

/**
 * This class represents a generic product
 *
 */
public abstract class Merchandise extends DomainEntity {

    /**
     * Product name
     */
    protected String name;

    /**
     * Product price
     */
    protected BigDecimal price;
}
