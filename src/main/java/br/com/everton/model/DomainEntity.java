package br.com.everton.model;

import java.util.Calendar;

/**
 * Class to represent a domain model entities
 * and hold common attributes related to them
 */
public abstract class DomainEntity {

    /**
     * Primary key
     */
    private Long id;

    /**
     * Timestamp for creation date
     * and last update date
     */
    private Calendar createdAt;
    private Calendar updatetedAt;
}
