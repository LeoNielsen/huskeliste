package com.example.tirsdag_den_261021;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String navn = request.getParameter("name");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        if (pass1.equals(pass2)) {

            HttpSession session = request.getSession();

            session.setAttribute("navn",navn);

            request.setAttribute("session",session);
            request.setAttribute("navn",navn);

            request.getRequestDispatcher("WEB-INF/bruger.jsp").forward(request,response);
        }
        else {

            String msg = "dine passwords var ikke ens!";

            request.setAttribute("msg",msg);

            request.getRequestDispatcher("index.jsp").forward(request,response);
        }


    }

    public void destroy() {
    }
}