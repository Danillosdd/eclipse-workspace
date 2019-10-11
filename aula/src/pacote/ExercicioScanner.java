package pacote;

import java.util.Scanner;


public class ExercicioScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o 'F' para Feminino , ou 'M' para Masculino: ");
		String valorDigitado = sc.nextLine();
		
		System.out.println("");
		
		if (valorDigitado.trim().equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
			System.out.println("--Fim Programa--");
		} else if (valorDigitado.trim().equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
			System.out.println("--Fim Programa--");
		} else {
			System.out.println("Sexo inválido");
			System.out.println("--Fim Programa--");
		}
		
		
		sc.close();
	}
	

}
