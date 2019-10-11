package com.jpa.teste;

import com.jpa.dao.PessoaDao;
import com.jpa.model.Pessoa;

public class TestaPessoaDao {

	// @SuppressWarnings("unused")
	// public static void main(String[] args) {

	// PessoaDao pessoaDao1 = PessoaDao.GetInstance();
	// PessoaDao pessoaDao2 = PessoaDao.GetInstance();
	// }

	static PessoaDao pessoaDao = PessoaDao.GetInstance();

	public static void main(String[] args) {

		// incluirPessoa();
		//buscarPessoaPorId();
		//updatePessoa();
		deletePessoaPorId();
	}

	@SuppressWarnings("unused")
	private static void incluirPessoa() {

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("03303081140");
		pessoa.setNome("Danillo Araujo de Paiva");

		pessoaDao.persist(pessoa);

	}

	@SuppressWarnings("unused")
	private static void buscarPessoaPorId() {

		Pessoa p = pessoaDao.getById(8);
		
		System.out.println(p);

	}
	
	@SuppressWarnings("unused")
	private static void updatePessoa() {
	
		Pessoa pessoaAlterar = new Pessoa();
		
		pessoaAlterar.setId(8);
		pessoaAlterar.setCpf("30030030030");
		pessoaAlterar.setNome("Karizi Fernandes dos Santos");
		
		pessoaDao.merge(pessoaAlterar);
	}
	
	private static void deletePessoaPorId() {

		Pessoa pessoaDeletar = new Pessoa();
		
		pessoaDeletar.setId(8);
		
		pessoaDao.remove(pessoaDeletar);

	}
}
