package org.gestion.tp3.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.gestion.tp3.DAO.EtudiantDao;
import org.gestion.tp3.domain.Etudiant;

import java.io.IOException;
import java.util.List;

@WebServlet("/ajouter")
public class AjouterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EtudiantDao dao=new EtudiantDao();
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String code=request.getParameter("code");
        String nom=request.getParameter("nom");
        String ville=request.getParameter("ville");
        int age=Integer.parseInt(request.getParameter("age"));
        Etudiant e= new Etudiant(code, nom, ville, age);
        dao.add(e);
        List<Etudiant> l=dao.findAll();
//PrintWriter out=response.getWriter();
//for(Etudiant et:l) out.println(et.getNom()+"<br/>");
        request.setAttribute("all", l);
        request.getRequestDispatcher("etudiants.jsp").forward(request,
                response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }}