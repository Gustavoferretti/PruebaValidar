/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chapa
 */
public class Validar extends HttpServlet {

Usuario us=new Usuario();
UsuarioDAO uD=new UsuarioDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("ingresar")){
        String user=request.getParameter("txtuser");
        String pass=request.getParameter("txtpass");
        us=uD.Validar(user, pass);
        
        if(us.getUsuario()!=null){
            request.getRequestDispatcher("Controlador?accion=Principal").forward(request, response);
        
        }else{
        
        
        request.getRequestDispatcher("index.jsp").forward(request, response);}
        
        }else{
        
         request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
