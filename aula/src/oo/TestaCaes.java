package oo;

import java.util.Scanner;

public class TestaCaes {
	public static void main(String[] args) {

		Cachorro cachorro1 = new Cachorro();

		cachorro1.nome = "Pluto";
		cachorro1.corOlhos = "azuis";
		cachorro1.peso = 53;
		cachorro1.quantPatas = 4;

		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Rex";
		cachorro2.corOlhos = "amarelho";
		cachorro2.peso = 22;
		cachorro2.quantPatas = 3;

		System.out.println("-------------------------");
		System.out.println(cachorro1.nome);
		System.out.println(cachorro1.corOlhos);
		System.out.println(cachorro1.peso);
		System.out.println(cachorro1.quantPatas);
		
		System.out.println("-------------------------");
		System.out.println(cachorro2.nome);
		System.out.println(cachorro2.corOlhos);
		System.out.println(cachorro2.peso);
		System.out.println(cachorro2.quantPatas);
	
		Scanner teclado = new Scanner(System.in);
		Cachorro cachorro3 = new Cachorro();

		System.out.println("-------------------------\n");
		
		System.out.println("Informe o Nome do Cachorro: ");
		cachorro3.nome = teclado.nextLine();

		
		System.out.println("Informe o Cor dos Olhos do Cachorro: ");
		cachorro3.corOlhos = teclado.nextLine();
		
		System.out.println("Informe o Peso do Cachorro: ");
		cachorro3.peso = teclado.nextInt();
		
		System.out.println("Informe o Quantidade de Pata do Cachorro: ");
		cachorro3.quantPatas = teclado.nextInt();


		System.out.println("-------------------------");
		System.out.println(cachorro3.nome);
		System.out.println(cachorro3.corOlhos);
		System.out.println(cachorro3.peso);
		System.out.println(cachorro3.quantPatas);

		System.out.println("-------------------------");
		
 
		teclado.close();
	}

}
