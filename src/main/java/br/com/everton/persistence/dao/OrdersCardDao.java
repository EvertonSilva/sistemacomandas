package br.com.everton.persistence.dao;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.OrdersCard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Class to persist Orders Card data
 */
public class OrdersCardDao extends AbstractDao {

    public OrdersCardDao() {
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
