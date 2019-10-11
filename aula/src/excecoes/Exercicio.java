package excecoes;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String valor;

		System.out.println("Informe o Sexo: ");
		valor = teclado.nextLine();

		try {

			if (valor.trim().equals("F")) {
				System.out.println("F - Feminino");
			} else if (valor.trim().equals("M")) {
				System.out.println("M - Masculino");
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			
			System.out.println("Sexo Invalido: " + valor);

		}

		teclado.close();
	}
	
}
