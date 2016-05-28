package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<title>Image-less CSS3 Glowing Form Implementation</title>\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js\"></script>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/MyCss.css\">\n");
      out.write("\t<script>\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t  var $form_inputs =   $('form input');\n");
      out.write("\t\t  var $rainbow_and_border = $('.rain, .border');\n");
      out.write("\t\t  /* Used to provide loping animations in fallback mode */\n");
      out.write("\t\t  $form_inputs.bind('focus', function(){\n");
      out.write("\t\t  \t$rainbow_and_border.addClass('end').removeClass('unfocus start');\n");
      out.write("\t\t  });\n");
      out.write("\t\t  $form_inputs.bind('blur', function(){\n");
      out.write("\t\t  \t$rainbow_and_border.addClass('unfocus start').removeClass('end');\n");
      out.write("\t\t  });\n");
      out.write("\t\t  $form_inputs.first().delay(800).queue(function() {\n");
      out.write("\t\t\t$(this).focus();\n");
      out.write("\t\t  });\n");
      out.write("\t\t});\n");
      out.write("                \n");
      out.write("                function validar(){\n");
      out.write("                    \n");
      out.write("                    if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${validar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" == 1){\n");
      out.write("                        \n");
      out.write("                        alert(\"Usuario Já Cadastrado !!!\");\n");
      out.write("                        \n");
      out.write("                   }\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                </script>\n");
      out.write("\t\n");
      out.write("\t</head>\n");
      out.write("\t<body id=\"home\" onload=\"validar()\">\n");
      out.write("\t\t<div class=\"rain\">\n");
      out.write("\t\t\t<div class=\"border start\">\n");
      out.write("                            <form action=\"ServletCadastro\" method=\"post\">\n");
      out.write("                                        <label class=\"tituloCadastro\" style=\"font-size:130%\">CADASTRE-SE</label>\t\n");
      out.write("                                        <label for=\"Nome\">NOME</label>\n");
      out.write("\t\t\t\t\t<input name=\"nome\" type=\"text\" placeholder=\"Nome\"/>\n");
      out.write("\t\t\t\t\t<label for=\"cpf\">CPF</label>\n");
      out.write("\t\t\t\t\t<input name=\"cpf\" type=\"text\" placeholder=\"Cpf\"/>                                     \n");
      out.write("                                    \t\n");
      out.write("                                        <label for=\"Nome\">E-MAIL</label>\n");
      out.write("\t\t\t\t\t<input name=\"e-mail\" type=\"text\" placeholder=\"E-Mail\"/>\n");
      out.write("\t\t\t\t\t<label for=\"rg\">RG</label>\n");
      out.write("\t\t\t\t\t<input name=\"rg\" type=\"text\" placeholder=\"Rg\"/>\n");
      out.write("                                        <label for=\"endereco\">ENDEREÇO</label>\n");
      out.write("\t\t\t\t\t<input name=\"endereco\" type=\"text\" placeholder=\"Endereço\"/>\n");
      out.write("                                        <br>\n");
      out.write("                                        <label for=\"usuario\">USUARIO</label>\n");
      out.write("\t\t\t\t\t<input name=\"usuario\" type=\"text\" placeholder=\"Usuario\"/>\n");
      out.write("                                        <label for=\"senha\">SENHA</label>\t\t\t\t\t\n");
      out.write("                                        <input name=\"senha\" type=\"password\" placeholder=\"Senha\"/>\n");
      out.write("                                        <br>\n");
      out.write("                                        <input class=\"BotaoSubmit\" type=\"submit\" value=\"CADASTRAR\"/>\n");
      out.write("                                        <a  class=\"buttonExibir3\" href=\"index.jsp\">VOLTAR</a>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
