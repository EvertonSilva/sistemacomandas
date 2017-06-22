package br.com.everton.persistence.dao;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.order.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Class to persist Order data
 */
public class OrderDao extends AbstractDao {

    public OrderDao() {
        super.openConnection();
    }

    @Override
    public boolean insert(DomainEntity entity) {
        return false;
    }

    @Override
    public boolean update(DomainEntity entity) {
        return false;
    }

    @Override
    public boolean delete(DomainEntity entity) {
        return false;
    }

    @Override
    public List<DomainEntity> read(DomainEntity entity) {
        return null;
    }
}
