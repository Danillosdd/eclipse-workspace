package com.jpa.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Cliente;

public class TestaPersistenceCliente {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-projeto-b");
		EntityManager entityManager = factory.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Danillo Araujo");
		cliente.setProfissao("Analista");

		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		List<Cliente> todosClientesJPA = entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();

		for (Cliente clienteLaco : todosClientesJPA) {

			//implementa toString() via suporte da ferramenta
			
			System.out.println(clienteLaco);
		}

	}

}
