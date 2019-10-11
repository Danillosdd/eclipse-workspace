package metodo.estatico;

import java.util.Scanner;

public class TestaSomaEstatica {
	public static void main(String[] args) {

		Double num1;
		Double num2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o Primero Valor: ");
		num1 = teclado.nextDouble();

		System.out.println("Informe o Segundo Valor: ");
		num2 = teclado.nextDouble();

		System.out.println("--------------");
		System.out.println("O Resultado da Soma é: ");
		//SomaEstatica.soma(num1, num2);
		System.out.println(SomaEstatica.soma(num1, num2));

		System.out.println("--------------");
		System.out.println("O Resultado da Multiplicação é: ");
		//SomaEstatica.multiplicacao(num1, num2);

		System.out.println(SomaEstatica.multiplicacao(num1, num2));
		
		teclado.close();
	}

}
