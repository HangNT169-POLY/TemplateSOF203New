package com.template.demo.B9_JDBC.controller;

import com.template.demo.B9_JDBC.repository.GiangVienRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "GiangVienServlet", value = "/hien-thi")
public class GiangVienServlet extends HttpServlet {

    private GiangVienRepository gvRepository = new GiangVienRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("lists",gvRepository.getAll());
        request.getRequestDispatcher("/hien-thi.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
