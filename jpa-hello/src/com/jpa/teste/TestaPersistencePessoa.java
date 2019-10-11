package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Pessoa;

public class TestaPersistencePessoa {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hello");
		EntityManager entityManager = factory.createEntityManager();

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("03303081140");
		pessoa.setNome("Danillo Araujo");

		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();

		List<Pessoa> todasPessoasJPA = entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();

		for (Pessoa pessoaLaco : todasPessoasJPA) {

			//implementa toString() via suporte da ferramenta
			
			System.out.println(pessoaLaco);
		}

	}

}
