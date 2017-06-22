package br.com.everton.persistence.dao;

import br.com.everton.model.DomainEntity;

import java.util.List;

/**
 * Class to persist Order Item data
 */
public class OrderItemDao extends AbstractDao {

    public OrderItemDao() {
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
