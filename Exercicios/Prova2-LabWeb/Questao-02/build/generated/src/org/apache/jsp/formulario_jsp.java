package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validaForm(){\n");
      out.write("                var usuario = document.form.usuario.value;\n");
      out.write("                var mes = document.form.mes.value;\n");
      out.write("                var ano = document.form.ano.value;\n");
      out.write("                var senha = document.form.senha.value;\n");
      out.write("                var senha1 = document.form.senha1.value;\n");
      out.write("                var email = document.form.email.value;\n");
      out.write("                var avatar = document.form.avatar.value;\n");
      out.write("                var concordar = document.form.concordar.value;\n");
      out.write("                var erro = document.getElementById(\"erro\");\n");
      out.write("                \n");
      out.write("                if(usuario === \"\" && mes === \"\" && ano === \"\" && senha === \"\" && senha1 === \"\" && email === \"\" && avatar === \"\" && concordar === \"\"){\n");
      out.write("                    erro.innerHTML = \"Você deve preencher os campos!\";\n");
      out.write("                    document.form.usuario.focus();\n");
      out.write("                    return false;\n");
      out.write("                } \n");
      out.write("                if(nome.length < 5){\n");
      out.write("                    erro.innerHTML = \"O nome deve conter pelo menos 5 caracteres\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulário</h1>\n");
      out.write("        <form name=\"form\" action=\"Confirmacao.jsp\" onsubmit=\"return validaForm()\">\n");
      out.write("            Usuário: <input type=\"text\" name=\"usuario\"/><p>\n");
      out.write("            Mês e ano de Nascimento: <input type=\"text\" name=\"mes\" size=\"2\"/>\n");
      out.write("                       &nbsp / &nbsp <input type=\"text\" name=\"ano\" size=\"4\"/><p>\n");
      out.write("            Senha: <input type=\"text\" name=\"senha\" /><p>\n");
      out.write("            Confirma senha: <input type=\"text\" name=\"senha1\" value=\"\" /><p>\n");
      out.write("            e-mail: <input type=\"text\" name=\"email\" value=\"\" /><p>\n");
      out.write("            Avatar: <input type=\"file\" name=\"avatar\" value=\"\" /><p>\n");
      out.write("            Termos de uso: <br><textarea name=\"termos\" rows=\"10\" cols=\"50\" readonly>Aqui estão os termos de uso do sistema.</textarea><p>\n");
      out.write("            <input type=\"checkbox\" name=\"concordar\" value=\"\" /> Eu concordo com os termos de uso <p>\n");
      out.write("            <p>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" /><p>\n");
      out.write("            <font color=\"red\"><span id=\"erro\"></span></font>\n");
      out.write("        </form>\n");
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
