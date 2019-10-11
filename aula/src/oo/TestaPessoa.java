package oo;

import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("Infome a Cor dos Olhos: ");
		pessoa1.corOlhos = sc.nextLine();
		
		System.out.println("Infome a Cor do Cabelo: ");
		pessoa1.corCabelo = sc.nextLine();
		
		System.out.println("Infome o Sexo: ");
		pessoa1.sexo = sc.nextLine();
				
		System.out.println("Infome o Tipo Sanguineo: ");
		pessoa1.tipoSanguineo = sc.nextLine();
		
		
		System.out.println("------------------------");
		System.out.println(pessoa1.corOlhos);
		System.out.println(pessoa1.corCabelo);
		System.out.println(pessoa1.sexo);
		System.out.println(pessoa1.tipoSanguineo);
		System.out.println("------------------------");
		
		sc.close();
	}

}
