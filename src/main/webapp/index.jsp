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
        <style>
            fieldset {
                margin-bottom: 1em;
            }
        </style>
    </head>
    <body>
        <nav class="white" role="navigation">
            <div class="nav-wrapper container">
                <a href="/sistemacomandas" class="brand-logo black-text">Logo</a>
                <ul class="right">
                    <li><a href="/sistemacomandas" class="black-text">Inicio</a></li>
                    <li><a href="#!" class="black-text">Consultar comanda</a></li>
                </ul>
            </div>
        </nav>
        <div class="section">
            <div class="container">
                <%--<div class="row">
                    <h3>Produtos desta comanda</h3>
                    <div class="col m12">
                        <ul class="collection">
                            <li class="collection-item avatar">
                                <i class="material-icons circle">shop</i>
                                <span class="title">Produto: Refeição</span>
                                <br>
                                <span>código: #0001</span>
                                <p>Preço: R$0,00/Kg</p>
                                <p>Quantidade: 0</p>
                                <p>Subtotal: R$0,00</p>
                                <a href="#!" class="secondary-content"><i class="material-icons">delete</i></a>
                            </li>
                        </ul>
                    </div>
                </div>--%>
                <div class="row">
                    <div class="col m8">
                        <form action="cadastrarItem" method="post">
                            <fieldset>
                                <legend>Cadastrar novo item</legend>

                                <label for="orderCard">Comanda:</label>
                                <input id="orderCard" name="orderCard" type="text" placeholder="número da comanda">

                                <label for="prodCode">Código do Produto:</label>
                                <input id="prodCode" name="prodCode" type="text" placeholder="código do produto">

                                <label for="prodQuantity">Quantidade:</label>
                                <input id="prodQuantity" name="prodQuantity" type="number">
                            </fieldset>
                            <button class="btn" type="submit">Incluir item</button>
                        </form>
                    </div>
                    <%--<div class="col m4">
                        <h5>${productName}</h5>
                        <p><fmt:formatNumber value="${productPrice}" type="currency" /></p>
                        <div class="btn-wrapper">
                            <button class="btn-floating" title="Adicionar produto à lista">
                                <i class="material-icons">add</i>
                            </button>
                        </div>
                    </div>--%>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
    </body>
</html>
