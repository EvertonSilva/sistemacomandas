package br.com.everton.persistence.dao;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.order.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Class to persist Products data
 */
public class ProductDao extends AbstractDao {

    public ProductDao() {
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
