package com.danillosdd.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.*;

@WebServlet("/Servletjstl")
public class ServletJstl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Livro livro = new Livro();
		livro.setAutor("Danillo");
		livro.setDescricao("Livro feito pelo Danillo");
		livro.setTitulo("O Livro");

		Livro livro2 = new Livro();
		livro2.setAutor("Danillo-2");
		livro2.setDescricao("Livro feito pelo Danillo-2");
		livro2.setTitulo("O Livro-2");

		Livro livro3 = new Livro();
		livro3.setAutor("Danillo-3");
		livro3.setDescricao("Livro feito pelo Danillo-3");
		livro3.setTitulo("O Livro-3");

		Livro livro4 = new Livro();
		livro4.setAutor("Danillo-4");
		livro4.setDescricao("Livro feito pelo Danillo-4");
		livro4.setTitulo("O Livro-4");

		Livro livro5 = new Livro();
		livro5.setAutor("Danillo-5");
		livro5.setDescricao("Livro feito pelo Danillo-5");
		livro5.setTitulo("O Livro-5");

		List<Livro> listaLivros = new ArrayList<>();
		listaLivros.add(livro);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);

		request.setAttribute("listaLivrosNoAtributo", listaLivros);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
