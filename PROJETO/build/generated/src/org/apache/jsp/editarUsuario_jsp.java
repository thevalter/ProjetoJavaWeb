package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Pessoa;
import DAO.JdbcPessoaDao;
import DAO.PessoaDao;

public final class editarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\n");
      out.write("        \n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("\t\t\n");
      out.write("        ");


         if(session.getAttribute("login")  == null){
         
          RequestDispatcher r = request.getRequestDispatcher( "index.jsp" );
          r.forward( request, response );   
         
         }
        
         response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
         response.setHeader("Pragma","no-cache"); //HTTP 1.0 
         response.setDateHeader ("Expires", 0); //prevents caching 
         response.setHeader("Cache-Control","no-store"); //HTTP 1.1 
        
        
      out.write("    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\">\n");
      out.write("        \n");
      out.write("        Login: ");
      out.print( session.getAttribute("login"));
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        
        JdbcPessoaDao dao = new JdbcPessoaDao();
        Pessoa pessoa = new Pessoa();
        String login = session.getAttribute("login").toString();
  //      pessoa = dao.search(login);
        
        

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     \n");
      out.write("            <br><br>\n");
      out.write("         \t\t\t\t\n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <form  method=\"post\" action=\"ServletCadastro\" autocomplete=\"on\"> \n");
      out.write("                                <h1> Cadastro de Cliente </h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Nome Completo</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"nome\" required=\"required\" type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > E-mail</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"email\" required=\"required\" type=\"email\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"cpfsigin\" class=\"youpasswd\" data-icon=\"c\"> Cpf </label>\n");
      out.write("                                    <input id=\"cpfsigin\" name=\"cpf\" required=\"required\" type=\"text\" placeholder=\"453.862.861-25\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"rgsigin\" class=\"youpasswd\" data-icon=\"r\"> Rg </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"rg\" required=\"required\" type=\"text\" placeholder=\"25452-5\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"enderecosigin\" class=\"youpasswd\" data-icon=\"e\"> Endereço </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"endereco\" required=\"required\" type=\"password\" placeholder=\"Rua C, n.82\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"u\"> Usuario </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"usuario\" required=\"required\" type=\"text\" placeholder=\"usuario1\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"s\">Senha </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"senha\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                   \n");
      out.write("                                <p class=\"signin button\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Cadastrar\"/> \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">  \n");
      out.write("\t\t\t\t\t\t\t\t\tJá é cliente ?\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Faça o Login </a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                            </form>\n");
      out.write("                      \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
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
