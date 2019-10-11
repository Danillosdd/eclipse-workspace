package pacote;

import java.util.Scanner;

public class ExercicioParouImpar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");
		int valor = sc.nextInt();

		System.out.println("--------");
		
		if ((valor % 2) == 0) {
			System.out.println(valor + " é Par.");

		} else {
			System.out.println(valor + " é Impar.");
		}

		sc.close();

	}

}
