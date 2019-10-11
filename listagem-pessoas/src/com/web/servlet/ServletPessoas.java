package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.Pessoa;

@WebServlet("/ServletPessoas")
public class ServletPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Maria");
		pessoa.setIdade(40);
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(2);
		pessoa2.setNome("João");
		pessoa2.setIdade(67);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setId(3);
		pessoa3.setNome("José");
		pessoa3.setIdade(52);

		List<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(pessoa);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		request.setAttribute("listaPessoasNoAtributo", listaPessoas);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemPessoa.jsp");
		rd.forward(request, response);

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
