package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bemvindo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            var data = new Date();\n");
      out.write("            var diaSemana = data.getDay();\n");
      out.write("            var dia = data.getDate();\n");
      out.write("            var mes = data.getMonth();\n");
      out.write("            var ano = data.getFullYear();\n");
      out.write("            var d = document.getElementById(\"d\");\n");
      out.write("            var diaSemanaString;\n");
      out.write("            var mesString;\n");
      out.write("            if(diaSemana === 0){\n");
      out.write("                diaSemanaString = \"Domingo\";\n");
      out.write("            } else if(diaSemana === 1){\n");
      out.write("                diaSemanaString = \"Segunda-Feira\";\n");
      out.write("            } else if(diaSemana === 2){\n");
      out.write("                diaSemanaString = \"Terça-Feira\";\n");
      out.write("            } else if(diaSemana === 3){\n");
      out.write("                diaSemanaString = \"Quarta-Feira\";\n");
      out.write("            } else if(diaSemana === 4){\n");
      out.write("                diaSemanaString = \"Quinta-Feira\";\n");
      out.write("            } else if(diaSemana === 5){\n");
      out.write("                diaSemanaString = \"Sexta-Feira\";\n");
      out.write("            } else {\n");
      out.write("                diaSemanaString = \"Sábado\";\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if(mes === 0){\n");
      out.write("                mesString = \"Janeiro\";\n");
      out.write("            } else if(mes === 1){\n");
      out.write("                mesString = \"Fevereiro\";\n");
      out.write("            } else if(mes === 2){\n");
      out.write("                mesString = \"Março\";\n");
      out.write("            } else if(mes === 3){\n");
      out.write("                mesString = \"Abril\";\n");
      out.write("            } else if(mes === 4){\n");
      out.write("                mesString = \"Maio\";\n");
      out.write("            } else if(mes === 5){\n");
      out.write("                mesString = \"Junho\";\n");
      out.write("            } else if(mes === 6){\n");
      out.write("                mesString = \"Julho\";\n");
      out.write("            } else if(mes === 7){\n");
      out.write("                mesString = \"Agosto\";\n");
      out.write("            } else if(mes === 8){\n");
      out.write("                mesString = \"Setembro\";\n");
      out.write("            } else if(mes === 9){\n");
      out.write("                mesString = \"Outubro\";\n");
      out.write("            } else if(mes === 10){\n");
      out.write("                mesString = \"Novembro\";\n");
      out.write("            } else if(mes === 11){\n");
      out.write("                mesString = \"Dezembro\";\n");
      out.write("            } \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            d.innerHTML = diaSemanaString + \", \" + dia + \" de \" mesString + \" de \" + ano;\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h2>Bem Vindo! <!--nome--></h2>\n");
      out.write("            <h3 id=\"d\"></h3>\n");
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
