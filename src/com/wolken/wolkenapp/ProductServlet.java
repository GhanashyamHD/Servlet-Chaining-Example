package com.wolken.wolkenapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns =  "/product" , loadOnStartup = +900)
public class ProductServlet extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	  String name = req.getParameter("mobile");
    	  String quantity = req.getParameter("quantity");
    	  req.setAttribute("mob", name);
    	  req.setAttribute("quan", quantity);
    	  RequestDispatcher dispatcher = req.getRequestDispatcher("/final");
    	  dispatcher.forward(req, resp);
    
    }

}

