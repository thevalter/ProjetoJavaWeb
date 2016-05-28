/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Bean.Pessoa;
import DAO.JdbcPessoaDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Douglas
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {




  


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       Pessoa novaPessoa = new Pessoa();
       novaPessoa.setUsuario(request.getParameter("usuario"));
       novaPessoa.setSenha(request.getParameter("senha"));
       

       
       JdbcPessoaDao pessoaDao = new JdbcPessoaDao();
       boolean validar = pessoaDao.validar(novaPessoa);
       int erro = 1;
        
       
       
       
       if(validar){
       
            HttpSession session = request.getSession();
            session.setAttribute("usuario", novaPessoa.getUsuario());
            session.setMaxInactiveInterval(10*60);
            response.sendRedirect("exibirTodos.jsp");
            
       }else{
       
            RequestDispatcher r = request.getRequestDispatcher( "index.jsp" );
            request.setAttribute("validar", erro);
            r.forward( request, response );  
            response.sendRedirect("exibirTodos.jsp");
       }
       
    }

  
 

}
