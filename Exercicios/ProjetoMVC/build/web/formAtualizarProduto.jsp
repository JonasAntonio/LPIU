<%-- 
    Document   : formAtualizarProduto
    Created on : 09/11/2017, 21:59:46
    Author     : jonas
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="prod" scope="session" class="beans.Produto" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h3>Alteração de Produto</h3>
        <p>
        <div name="divForm">
                <form action="ServletProduto" method="get">
                    Codigo: <input type="text" name="codigo" value="${prod.codigo}" readonly/><p><%--readonly--%>
                    Nome: <input type="text" name="nome" value="${prod.nome}"><p>
                    Fornecedor: <input type="text" name="fornecedor" value="${prod.fornecedor}"/><p>
                    Tipo: 
                        <select name="tipo" value ="${prod.tipo}">
                            <option>Alimentação</option>
                            <option>Vestuário</option>
                            <option>Eletrônicos</option>
                        </select><p>
                    <input type="hidden" value="5" name="opcao">
                    Preço: <input type="text" name="preco" value="${prod.preco}"/><p>
                    Data de Validade: <input type="text" name="datavalidade" value="${prod.datavalidade}"/><p>
                    <input type="submit" value="Alterar" />
                </form>
            </div>
        </center>
    </body>
</html>