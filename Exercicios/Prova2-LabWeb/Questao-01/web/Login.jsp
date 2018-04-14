<%-- 
    Document   : Login
    Created on : 29/11/2017, 18:08:12
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="Javascript">
            function vetores(){
                var usuarios = [administrador, professor, aluno, 
                                   estagiario, funcionario, pesquisador, publico];
                var senhas = [administrador, professor, alunoaluno, estagiario, 
                             funcionario, pesquisador, publicopublico];
            }
            
            function verificaLogin(){
                //vetores();
                //quando a função de vetores é chamada, o verificaLogin() não funciona.
                var nome = document.form1.nome.value;
                var email = document.form1.email.value;
                var senha = document.form1.senha.value;
                var erro = document.getElementById("erro");
                
                if(senha.length < 8){
                    erro.innerHTML = "Senha inválida!";
                    document.form1.senha.focus();
                    return false;
                }
            }
            
        </script>
    </head>
    
    <body>
        <center>
            <h3>Login</h3>
            <form action="ServletLogin" method="get" onsubmit="return verificaLogin()" name="form1">
                Usuário: <select name="tipoUsuario">
                    <option>Administrador</option>
                    <option>Professor</option>
                    <option>Aluno</option>
                    <option>Estagiario</option>
                    <option>Funcionario</option>
                    <option>Pesquisador</option>
                    <option>Publico</option>
                </select><p>
                Nome: <input type="text" name="nome"/><p>
                Email: <input type="text" name="email"/><p>
                Senha: <input type="text" name="senha"/><p>
                <input type="submit" value="Login" />
            </form>
            <p>
                <font color="red"><span id="erro"></span></font>
        </center>
    </body>
</html>
