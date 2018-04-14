<%-- 
    Document   : formProduto
    Created on : 04/10/2017, 22:07:44
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="prod" scope="page" class="beans.Produto" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                border: 1px solid black;
                width: 30%;
            }
        </style>
    </head>
    <body>
        <center>
            <h1>Formulário de Produto</h1>
            <p>
        
            <div name="divForm">
                <form action="ServletProduto" method="get">
                    Codigo: <input type="text" name="codigo" /><p>
                    Nome: <input type="text" name="nome"><p>
                    Fornecedor: <input type="text" name="fornecedor" /><p>
                    Tipo: 
                        <select name="tipo">
                            <option>Alimentação</option>
                            <option>Vestuário</option>
                            <option>Eletrônicos</option>
                        </select><p>
                    <input type="hidden" value="1" name="opcao">
                    Preço: <input type="text" name="preco" /><p>
                    Data de Validade: <input type="date" name="datavalidade" /><p>
                    <input type="submit" value="Enviar" />
                    <input type="reset" value="Limpar" />
                </form>
            </div>
        </center>
    </body>
</html>
