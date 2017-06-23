package br.com.everton.control;

import br.com.everton.model.DomainEntity;
import br.com.everton.model.OrdersCard;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by everton on 23/06/17.
 */
public class OrdersCardVh implements IViewHelper {
    @Override
    public DomainEntity getEntity(HttpServletRequest req) {
        String ordersCardNumber = req.getParameter("orderCard");
        OrdersCard card = new OrdersCard();

        card.setBarcode(ordersCardNumber);

        return card;
    }

    @Override
    public void setView(Object object, HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);

    }
}
