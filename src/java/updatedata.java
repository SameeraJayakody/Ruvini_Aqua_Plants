/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maduranga
 */
@WebServlet(urlPatterns = {"/updatedata"})
public class updatedata extends HttpServlet {
    
    
    Employee emp1 = new Employee();
    
    public updatedata()
    {
    
    super();
    }

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
         
           String id= request.getParameter("u").trim();
           
           emp1.setplantcode(id);
            
             String mess=emp1.retrievedb(id);
             
              if(mess == "Success"){
                   
                  
                      response.sendRedirect("Listemployee.jsp");
                  
                 out.println("successfully retrieved") ;
                  
                  }else{
                  
                      out.println(mess) ;
                  
                  }
        
           
             
             
      //    String id = request.getParameter("plantcode");
        //     String name = request.getParameter("plantname");
          //    String qun = request.getParameter("quantity");
            //   String pric = request.getParameter("price");
              //  String dat = request.getParameter("date");
                
                  
                  
                  
             //     emp1.setplantcode(id);
               //   emp1.setplantname(name);
                 // emp1.setquantity(qun);
                 // emp1.setprice(pric);
                 // emp1.setdate(dat);
                 
                  
                  
              
                  
             
      
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updatedata</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("I am done");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
