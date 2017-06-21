package br.com.everton.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by everton on 20/06/17.
 */
@WebServlet(name = "FrontController", urlPatterns = {"/cadastrarItem"})
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String orderCardNumber = req.getParameter("orderCard");
        String prodCode = req.getParameter("prodCode");
        String prodQuantity = req.getParameter("prodQuantity");

        // TODO buscar produto no banco - DAO produto
        // TODO buscar comanda no banco - DAO comanda
        // TODO instanciar um item de pedido
        // TODO adicionar produto ao novo item de pedido
        // TODO adicionar item de pedido à lista de items do pedido da comanda
        // TODO salvar pedido

        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);
    }
}
