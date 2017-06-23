package br.com.everton.control;

import br.com.everton.model.DomainEntity;

/**
 * Created by everton on 23/06/17.
 */
public interface ICommand {

    Object execute(DomainEntity entity);
}
