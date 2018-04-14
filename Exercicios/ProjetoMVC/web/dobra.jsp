<%-- 
    Document   : dobra
    Created on : 05/10/2017, 21:10:26
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="calc" scope="page" class="beans.CalculadoraBean" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado do Calculo</h1>
        <p>
            <%
                int val = 10;
                int d = calc.dobro(val);
            %>
            Dobro do valor: <%= d %>
    </body>
</html>
