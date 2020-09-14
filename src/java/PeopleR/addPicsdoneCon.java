/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeopleR;

import Login.Accounts;
import Login.DBLoginAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "addPicsdoneCon", urlPatterns = {"/adp"})
public class addPicsdoneCon extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String a = request.getParameter("pics");
        String b = request.getParameter("peop");
        String user = request.getParameter("few");
        Accounts db = new Accounts();
        List<commentandR> ppl = new LinkedList<>();
        List<String> gall = new LinkedList<>();
        DBLoginAccess dao = new DBLoginAccess();
        PeopleRAccess route = new PeopleRAccess();
        System.out.print(b+"ernboirenbore"+a);
        PeopleRAccess o = new PeopleRAccess();
        try {
            gall = route.picss(b);
            db = dao.takeID(Integer.parseInt(user));
            ppl = route.sow(b);
            session.setAttribute("peo", b);
            session.setAttribute("user", db);
            session.setAttribute("CaR", ppl);
            session.setAttribute("pics", gall);
            o.insertd(a, b);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addPicsdoneCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("private/Gallery.jsp");
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
