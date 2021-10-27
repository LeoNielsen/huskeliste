package com.example.tirsdag_den_261021;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TilføjEmneServlet", value = "/TilføjEmneServlet")
public class TilEmneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String emne = request.getParameter("emne");


        HttpSession session = request.getSession();
        List<String> emneList = (List<String>) session.getAttribute("emneList");


        if (emneList == null) {
            emneList = new ArrayList<>();
        }

        ServletContext servletContext =getServletContext();

        List<String> allebrugersemner = (List<String>) servletContext.getAttribute("allebrugersemner");

        if (allebrugersemner == null){
            allebrugersemner = new ArrayList<>();
        }

        allebrugersemner.add(emne);

        servletContext.setAttribute("allebrugersemner",allebrugersemner);

        emneList.add(emne);

        session.setAttribute("emneList",emneList);

        request.getRequestDispatcher("WEB-INF\\bruger.jsp").forward(request,response);
    }
}
