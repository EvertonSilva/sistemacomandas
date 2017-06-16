<%--
  Created by IntelliJ IDEA.
  User: everton
  Date: 15/06/17
  Time: 06:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Inicio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
    </head>
    <body>
        <nav class="white" role="navigation">
            <div class="nav-wrapper container">
                <a href="#!" class="brand-logo black-text">Logo</a>
                <ul class="right">
                    <li><a href="#!" class="black-text">Inicio</a></li>
                </ul>
            </div>
        </nav>
        <div class="section">
            <div class="container">
                <h1>Número da comanda: <small>#1001</small></h1>
                <div class="row">
                    <div class="col m5">
                        <form action="#!">
                            <fieldset>
                                <legend>Cadastrar pedido</legend>

                                <label for="code">Código:</label>
                                <input type="text" id="code" placeholder="código do produto">

                                <label for="product">Nome:</label>
                                <input type="text" id="product" placeholder="buscar por nome">

                                <label for="quantity">Quantidade:</label>
                                <input type="number" id="quantity">
                            </fieldset>

                            <div class="btn-wrapper">
                                <button class="btn-floating right" type="submit">
                                    <i class="material-icons">add</i>
                                </button>
                            </div>
                        </form>
                    </div>
                    <div class="col m6">
                        <table>
                            <thead>
                                <tr>
                                    <th>Produto</th>
                                    <th>Valor (R$)</th>
                                    <th>Qtde</th>
                                    <th>Subtotal</th>
                                    <th>Remover</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%-- instancia um objeto dao --%>
                                <jsp:useBean id="dao" class="br.com.everton.persistence.dao.OrderDao" />
                                <c:forEach var="order" items="${dao.list}" varStatus="itr">
                                    <tr>
                                        <td>${order.id}</td>
                                        <td>${order.total}</td>
                                        <td>
                                            <fmt:formatDate value="${order.orderedDate.time}"
                                                            pattern="dd/MM/yyyy HH:mm" />
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <td colspan="4"><strong>Total:</strong> R$ 14,00</td>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
    </body>
</html>
