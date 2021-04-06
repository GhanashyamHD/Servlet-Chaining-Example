package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/final")
public class FinalServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post method is created");
		String mobName = (String)req.getAttribute("mob");
		String quantity = (String)req.getAttribute("quan");
		double price = (Integer.parseInt(quantity)*45000.00);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Total amount in cart is" + price);
		printWriter.flush();
		printWriter.close();
		
		//super.doGet(req, resp);
	}

}
