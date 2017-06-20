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
                <a href="#!" class="brand-logo black-text">Logo</a>
                <ul class="right">
                    <li><a href="#!" class="black-text">Inicio</a></li>
                </ul>
            </div>
        </nav>
        <div class="section">
            <div class="container">
                <div class="row">
                    <h3>Produtos desta comanda</h3>
                    <div class="col m12">
                        <ul class="collection">
                            <li class="collection-item avatar">
                                <i class="material-icons circle">shop</i>
                                <span class="title">Produto</span>
                                <p>Preço: R$0,00</p>
                                <p>Quantidade: 0</p>
                                <a href="#!" class="secondary-content"><i class="material-icons">delete</i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="row">
                    <div class="col m8">
                        <form action="#!">
                            <fieldset>
                                <legend>Cadastrar novo item</legend>

                                <label for="code">Comanda:</label>
                                <input type="text" id="order-card" placeholder="número da comanda">

                                <label for="code">Código do Produto:</label>
                                <input type="text" id="code" placeholder="código do produto">

                                <label for="product">Nome do Produto:</label>
                                <input type="text" id="product" placeholder="buscar por nome">

                                <label for="quantity">Quantidade:</label>
                                <input type="number" id="quantity">
                            </fieldset>
                            <button class="btn" type="submit">Salvar!</button>
                        </form>
                    </div>
                    <div class="col m4">
                        <h5>Nome do Produto</h5>
                        <p>R$0,00</p>
                        <div class="btn-wrapper">
                            <button class="btn-floating" title="Adicionar produto à lista">
                                <i class="material-icons">add</i>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
    </body>
</html>
