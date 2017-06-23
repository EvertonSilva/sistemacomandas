package br.com.everton.control;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.OrdersCard;

/**
 * Created by everton on 23/06/17.
 */
public class GetOrdersCard extends AbstractCommand {

    @Override
    public Object execute(DomainEntity entity) {
        OrdersCard card = (OrdersCard) entity;
        return orderService.findOrdersCard(card.getBarcode());
    }
}
