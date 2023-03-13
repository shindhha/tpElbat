package com.example.tpelbat;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletDisconnect", value = "/ServletDisconnect")
public class ServletDisconnect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        chatRoom.getInstance().deconnecter(request.getParameter("pseudo"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
