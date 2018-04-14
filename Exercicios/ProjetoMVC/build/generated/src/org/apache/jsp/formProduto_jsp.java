package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      beans.Produto prod = null;
      synchronized (_jspx_page_context) {
        prod = (beans.Produto) _jspx_page_context.getAttribute("prod", PageContext.PAGE_SCOPE);
        if (prod == null){
          prod = new beans.Produto();
          _jspx_page_context.setAttribute("prod", prod, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                width: 30%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h1>Formulário de Produto</h1>\n");
      out.write("            <p>\n");
      out.write("        \n");
      out.write("            <div name=\"divForm\">\n");
      out.write("                <form action=\"ServletProduto\" method=\"get\">\n");
      out.write("                    Codigo: <input type=\"text\" name=\"codigo\" /><p>\n");
      out.write("                    Nome: <input type=\"text\" name=\"nome\"><p>\n");
      out.write("                    Fornecedor: <input type=\"text\" name=\"fornecedor\" /><p>\n");
      out.write("                    Tipo: \n");
      out.write("                        <select name=\"tipo\">\n");
      out.write("                            <option>Alimentação</option>\n");
      out.write("                            <option>Vestuário</option>\n");
      out.write("                            <option>Eletrônicos</option>\n");
      out.write("                        </select><p>\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcao\">\n");
      out.write("                    Preço: <input type=\"text\" name=\"preco\" /><p>\n");
      out.write("                    Data de Validade: <input type=\"date\" name=\"datavalidade\" /><p>\n");
      out.write("                    <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("                    <input type=\"reset\" value=\"Limpar\" />\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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
