package com.example.tirsdag_den_261021;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet(name = "TilføjEmneServlet", value = "/TilføjEmneServlet")
public class TilEmneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String emne = request.getParameter("emne");


        HttpSession session = request.getSession();
        Set<String> emneList = (Set<String>) session.getAttribute("emneList");


        if (emneList == null) {
            emneList = new HashSet<>();
        }

        ServletContext servletContext =getServletContext();

        Set<String> allebrugersemner = (Set<String>) servletContext.getAttribute("allebrugersemner");

        if (allebrugersemner == null){
            allebrugersemner = new HashSet<>();
        }

        allebrugersemner.add(emne);

        servletContext.setAttribute("allebrugersemner",allebrugersemner);

        emneList.add(emne);

        session.setAttribute("emneList",emneList);

        request.getRequestDispatcher("WEB-INF\\bruger.jsp").forward(request,response);
    }

    public void onClick(){
        

    }
}
