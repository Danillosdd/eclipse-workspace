package com.danillosdd.servletbootstrap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String profissao = request.getParameter("profissao");
		
		out.println("<html>"
				+ "<head>"
				+ "<title>"
				+ "Hello Servlet"
				+ "</title>"
				+ "</head>"
				+ "<body>"
				+ "<h2>Meu Nome é:/<h2>"
				+ "<h4>"+nome+"</h4>"
				+ "<br>"
				+ "<h2>Minha Profissão é:</h2>"
				+ "<h4>"+profissao+"</h4>"
				+ "</body>"
				+ "</html>"
				);
				
		

		 
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
