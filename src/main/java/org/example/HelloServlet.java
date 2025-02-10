package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8"); // Указываем кодировку
        response.setCharacterEncoding("UTF-8"); // Дополнительно устанавливаем UTF-8
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>GET сұранысы қабылданды!</h2>");
        out.println("<form method='POST' action='HelloServlet'>");
        out.println("Аты-жөніңіз: <input type='text' name='name'><br>");
        out.println("<input type='submit' value='Жіберу'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8"); // Указываем кодировку
        response.setCharacterEncoding("UTF-8"); // Дополнительно устанавливаем UTF-8
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name"); // Пайдаланушыдан алынған мәлімет
        out.println("<html><body>");
        out.println("<h2>POST сұранысы қабылданды!</h2>");
        out.println("<p>Сәлем, " + name + "!</p>");
        out.println("</body></html>");
    }
}
