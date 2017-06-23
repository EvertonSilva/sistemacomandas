package br.com.everton.control;

import br.com.everton.service.IOrderService;
import br.com.everton.service.OrderService;

/**
 * Created by everton on 23/06/17.
 */
public abstract class AbstractCommand implements ICommand {
    protected IOrderService orderService = new OrderService();
}
