package br.com.everton.persistence.dao;

import br.com.everton.model.DomainEntity;

import java.util.List;

/**
 * Created by everton on 22/06/17.
 */
public interface IDAO {
    boolean insert(DomainEntity entity);
    boolean update(DomainEntity entity);
    boolean delete(DomainEntity entity);
    List<DomainEntity> read(DomainEntity entity);
}
