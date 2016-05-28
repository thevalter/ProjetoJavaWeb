<%-- 
    Document   : inicialCliente
    Created on : 28/05/2016, 18:46:30
    Author     : Douglas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
	<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
          
                
          <script language= "JavaScript">
           
            function telaInicial(){
            
                location.href="inicialCliente.jsp"
            
             }
             
            function detalhesPedido(){
            
                location.href="inicialCliente.jsp"
            
             }
             
            function novoPedido(){
            
                location.href="inicialCliente.jsp"
            
             }
             
             
             
          </script>
                
                
                
                
    </head>
    <body>
        
        
        <br><br>
            <section>				
                <div id="container_demo" >
                   

                    <div id="wrapper">
                       
                             <h1> Area do Administrador </h1> 

                                    <p class="signin button"> 
				    
                                     <input type="button" onclick="telaInicial()" value="TELA INICIAL"/> 
                                     <input type="button" onclick="detalhesPedido()" value="CATEGORIAS"/> 
                                     <input type="button" onclick="novoPedido()" value="PRODUTOS"/> 
                                   
     
                                    </p>

                        </div>
                    </div>
                 
            </section>
        
        
        
        
        
        
        
        
        
    </body>
</html>
