<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : exibirProdutos
    Created on : 08/11/2017, 21:46:43
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Produtos Cadastrados</h3>
        <p>
        <table border="1">
            <tr>
                <th>Codigo</th>
                <th>Nome</th>
                <th>Fornecedor</th>
                <th>Tipo</th>
                <th>Preço</th>
                <th>Data de Validade</th>
                <th>Operação</th>
            </tr>
            <c:forEach var="prod" items="${sessionScope.produtos}">
                <tr>
                    <td>${prod.codigo}</td>
                    <td>${prod.nome}</td>
                    <td>${prod.fornecedor}</td>
                    <td>${prod.tipo}</td>
                    <td>${prod.preco}</td>
                    <td>${prod.datavalidade}</td>
                    
                    <td><a href="ServletProduto?opcao=3&codigo=${prod.codigo}">Remover</a>
                        &nbsp;<a href="ServletProduto?opcao=4&codigo=${prod.codigo}">Alterar</a>
                    </td>
                </tr>
            </c:forEach>
            
        </table>
        <a href="formProduto.jsp">Cadastrar Produto</a>
    </body>
</html>
