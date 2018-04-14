package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script language=\"Javascript\">\n");
      out.write("            \n");
      out.write("            function verificaLogin(){\n");
      out.write("                var usuarios = [administrador, professor, aluno, \n");
      out.write("                                   estagiario, funcionario, pesquisador, publico];\n");
      out.write("                var senhas = [administrador, professor, alunoaluno, estagiario, \n");
      out.write("                             funcionario, pesquisador, publicopublico];\n");
      out.write("                \n");
      out.write("                var tipoUsuario = document.form1.tipoUsuario.value;\n");
      out.write("                var nome = document.form1.nome.value;\n");
      out.write("                var email = document.form1.email.value;\n");
      out.write("                var senha = document.form1.senha.value;\n");
      out.write("                \n");
      out.write("                var erro = document.getElementById(\"erro\");\n");
      out.write("                \n");
      out.write("                if(senha.length < 8){\n");
      out.write("                    erro.innerHTML = \"Senha incorreta!\";\n");
      out.write("                    document.form1.senha.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h3>Login</h3>\n");
      out.write("            <form action=\"\" method=\"get\" onsubmit=\"return verificaLogin()\" name=\"form1\">\n");
      out.write("                Usuário: <select name=\"tipoUsuario\">\n");
      out.write("                    <option>Administrador</option>\n");
      out.write("                    <option>Professor</option>\n");
      out.write("                    <option>Aluno</option>\n");
      out.write("                    <option>Estagiario</option>\n");
      out.write("                    <option>Funcionario</option>\n");
      out.write("                    <option>Pesquisador</option>\n");
      out.write("                    <option>Publico</option>\n");
      out.write("                </select><p>\n");
      out.write("                Nome: <input type=\"text\" name=\"nome\"/><p>\n");
      out.write("                Email: <input type=\"text\" name=\"email\"/><p>\n");
      out.write("                Senha: <input type=\"text\" name=\"senha\"/><p>\n");
      out.write("                <input type=\"submit\" value=\"Login\" />\n");
      out.write("            </form>\n");
      out.write("            <p>\n");
      out.write("                <font color=\"red\"><span id=\"erro\"></span></font>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
