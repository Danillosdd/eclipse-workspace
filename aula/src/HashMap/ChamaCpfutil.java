package HashMap;

import java.util.Scanner;

public class ChamaCpfutil {

	public static void main(String[] args) {

		Cpfutil objeto = new Cpfutil();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o Cpf: ");
		String cpf = teclado.next();

		System.out.println("-----");

		// String resultado = objeto.retornarNomePorCpf(cpf);
		// System.out.println(resultado);

		System.out.println(objeto.retornarNomePorCpf(cpf));

		teclado.close();

	}

}
