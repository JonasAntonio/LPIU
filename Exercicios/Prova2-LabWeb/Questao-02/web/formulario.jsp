<%-- 
    Document   : formulario
    Created on : 29/11/2017, 18:25:09
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function validaForm(){
                var usuario = document.form.usuario.value;
                var mes = document.form.mes.value;
                var ano = document.form.ano.value;
                var senha = document.form.senha.value;
                var senha1 = document.form.senha1.value;
                var email = document.form.email.value;
                var avatar = document.form.avatar.value;
                var concordar = document.form.concordar.value;
                var erro = document.getElementById("erro");
                var data = new Date();
                
                if(usuario === ""){
                    erro.innerHTML = "Você deve preencher o campo de usuario!";
                    document.form.usuario.focus();
                    return false;
                } else if(mes === ""){
                    erro.innerHTML = "Você deve preencher o campo do mês!";
                    document.form.mes.focus();
                    return false;
                } else if(ano === ""){
                    erro.innerHTML = "Você deve preencher o campo do ano!";
                    document.form.ano.focus();
                    return false;
                } else if(senha === ""){
                    erro.innerHTML = "Você deve preencher o campo da senha!";
                    document.form.senha.focus();
                    return false;
                } else if(senha1 === ""){
                    erro.innerHTML = "Você deve preencher o campo de confirmação de senha!";
                    document.form.senha1.focus();
                    return false;
                } else if(email === ""){
                    erro.innerHTML = "Você deve preencher o campo do email!";
                    document.form.email.focus();
                    return false;
                } else if(avatar === ""){
                    erro.innerHTML = "Você deve enviar uma imagem para seu avatar!";
                    document.form.avatar.focus();
                    return false;
                } else if(concordar === ""){//deu problema
                    erro.innerHTML = "Você deve concordar com os termos para continuar!";
                    document.form.concordar.focus();
                    return false;
                } 

                if(usuario.length < 5){
                    erro.innerHTML = "O nome de usuário deve conter pelo menos 5 caracteres";
                    document.form.usuario.focus();
                    return false;
                }
                
                if(senha !== senha1){
                    erro.innerHTML = "Confirmação de senha incorreta!";
                    document.form.senha1.focus();
                    return false;
                }
                
                if(mes<1 || mes>12){
                    erro.innerHTML = "Digite um mês entre 1 e 12!";
                    document.form.mes.focus();
                    return false;
                }
                
                if((data.getFullYear() - ano) < 18){
                    erro.innerHTML = "Você deve ter mais de 18 anos para acessar!";
                    document.form.mes.focus();
                    return false;
                }
                
                usuario.toUpperCase();
            }
        </script>
    </head>
    <body>
        <h1>Formulário</h1>
        <form name="form" action="Confirmacao.jsp" onsubmit="return validaForm()">
            Usuário: <input type="text" name="usuario"/><p>
            Mês e ano de Nascimento: <input type="text" name="mes" size="2"/>
                       &nbsp / &nbsp <input type="text" name="ano" size="4"/><p>
            Senha: <input type="password" name="senha" /><p>
            Confirma senha: <input type="password" name="senha1" value="" /><p>
            e-mail: <input type="text" name="email" value="" /><p>
            Avatar: <input type="file" name="avatar" value="" /><p>
            Termos de uso: <br><textarea name="termos" rows="10" cols="50" readonly>Aqui estão os termos de uso do sistema.</textarea><p>
            <input type="checkbox" name="concordar" /> Eu concordo com os termos de uso <p>
            <p>
            <input type="submit" value="Cadastrar" /><p>
            <font color="red"><span id="erro"></span></font>
        </form>
    </body>
</html>