package com.example.JavaWebwork;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class JavaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentname = req.getParameter("studentname");
        int age = Integer.parseInt(req.getParameter("age"));
        String phonenumber = req.getParameter("phonenumber");
        PrintWriter out = resp.getWriter();
        out.println("studentname：" + studentname + "," + "age：" + age + "phonenumber：" + phonenumber);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }


}