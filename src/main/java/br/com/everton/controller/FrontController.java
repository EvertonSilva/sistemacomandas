package br.com.everton.controller;

import br.com.everton.control.GetOrdersCard;
import br.com.everton.control.ICommand;
import br.com.everton.control.IViewHelper;
import br.com.everton.control.OrdersCardVh;
import br.com.everton.model.DomainEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by everton on 20/06/17.
 */
@WebServlet(name = "FrontController", urlPatterns = {"/consultarComanda"})
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Map<String, ICommand> commands;
    private Map<String, IViewHelper> vhs;

    public FrontController() {
        commands = new HashMap<String, ICommand>();
        commands.put("CONSULTAR_COMANDA", new GetOrdersCard());

        vhs = new HashMap<String, IViewHelper>();
        vhs.put("/sistemacommandas/consultarComanda", new OrdersCardVh());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uri = req.getRequestURI();
        IViewHelper vh = vhs.get(uri);

        String action = req.getParameter("action");
        ICommand cmd = commands.get(action.toUpperCase());

        DomainEntity entity = vh.getEntity(req);
        Object obj = cmd.execute(entity);

        vh.setView(obj, req, resp);
    }
}
