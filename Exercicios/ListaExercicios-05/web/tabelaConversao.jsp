<%-- 
    Document   : tabelaConversao
    Created on : 30/08/2017, 21:48:55
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    float c,f=0;
    c = (f-30)/2;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Converção de Celsius para Fahrenheit</title>
    </head>
    <body>
    <center>
        <h1>Converção de Celsius para Fahrenheit</h1><br><br>
        <table>
            <tr>
                <th>Fahrenheit</th>
                <th>Celsius</th>
            </tr>
            <%
                do
                {
            %>
            <tr>
                <td><%= f %></td>
                <td><%= c %></td>
            </tr>
            <%
                f+=2;
                c = (f-30)/2;
                }while(c<=60);
            %>
        </table>
    </body>
</html>
