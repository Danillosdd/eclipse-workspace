package jdbc;

import java.util.Scanner;

import sistema.Cliente;

public class MainClienteDao {

	static Cliente cliente = new Cliente();
	static ClienteDao clientedao = new ClienteDao();

	public static void main(String[] args) {

		cliente.setCodigo(1);
		cliente.setNome("Danillo Araujo");
		cliente.setLogin("danillosdd");
		cliente.setSenha("honeypot");
		cliente.setEndereco("Avenida");
		cliente.setCidade("Goiânia");
		cliente.setBairro("Jardim");
		cliente.setEstado("Goiás");
		cliente.setCep("74.463-330");

		Scanner teclado = new Scanner(System.in);

		System.out.println("--------------");
		System.out.println("i = inserir");
		System.out.println("u = update");
		System.out.println("c = consulta");
		System.out.println("d = deletar");
		System.out.println("--------------");
		System.out.println("O que deseja fazer? ");
		char opcao = teclado.next().charAt(0);

		switch (opcao) {

		case 'i':
			inserir();
			break;

		case 'u':
			update();
			break;

		case 'c':
			consultar();
			break;

		case 'd':
			deletar();
			break;
		}

		// inserir();
		// update();
		// consultar();
		// deletar();

		teclado.close();
		
		System.out.println("Fim!");
	}

	public static void inserir() {

		clientedao.inserirCliente(cliente);

	}

	public static void update() {

		cliente.setEndereco("Rua 4");
		clientedao.updateCliente(cliente);

	}

	public static void consultar() {

		Cliente clienteRetorno = clientedao.obterCliente(cliente);
		System.out.println(clienteRetorno);
		System.out.println("------------------------");

	}

	public static void deletar() {

		cliente.setCodigo(3);
		clientedao.deletarCliente(cliente);

	}
}
