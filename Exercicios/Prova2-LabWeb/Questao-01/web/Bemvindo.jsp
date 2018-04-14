<%-- 
    Document   : Bemvindo
    Created on : 29/11/2017, 18:11:57
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="Javascript">
            var data = new Date();
            var diaSemana = data.getDay();
            var dia = data.getDate();
            var mes = data.getMonth();
            var ano = data.getFullYear();
            var d = document.getElementById("d");
            var diaSemanaString;
            var mesString;
            if(diaSemana === 0){
                diaSemanaString = "Domingo";
            } else if(diaSemana === 1){
                diaSemanaString = "Segunda-Feira";
            } else if(diaSemana === 2){
                diaSemanaString = "Terça-Feira";
            } else if(diaSemana === 3){
                diaSemanaString = "Quarta-Feira";
            } else if(diaSemana === 4){
                diaSemanaString = "Quinta-Feira";
            } else if(diaSemana === 5){
                diaSemanaString = "Sexta-Feira";
            } else {
                diaSemanaString = "Sábado";
            }
            
            if(mes === 0){
                mesString = "Janeiro";
            } else if(mes === 1){
                mesString = "Fevereiro";
            } else if(mes === 2){
                mesString = "Março";
            } else if(mes === 3){
                mesString = "Abril";
            } else if(mes === 4){
                mesString = "Maio";
            } else if(mes === 5){
                mesString = "Junho";
            } else if(mes === 6){
                mesString = "Julho";
            } else if(mes === 7){
                mesString = "Agosto";
            } else if(mes === 8){
                mesString = "Setembro";
            } else if(mes === 9){
                mesString = "Outubro";
            } else if(mes === 10){
                mesString = "Novembro";
            } else {
                mesString = "Dezembro";
            } 
            
            
            document.write(diaSemanaString + ", " + dia + " de " + mesString + " de " + ano);
        </script>
    </head>
    <body>
        <center>
            <h2>Bem Vindo! </h2>
            <h3>${sessionScope.nome}</h3>
            <span id="d"></span>
        </center>
    </body>
</html>
