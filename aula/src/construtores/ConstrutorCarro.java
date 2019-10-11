package construtores;

import construtores.Carro;

public class ConstrutorCarro {
	public static void main(String[] args) {

		String cor = "AZUL";
		String modelo = "ONIX";
		String placa = "MMS-1014";
		String nomeMotorista = "DANILLO";
		
		System.out.println("----------");
		Carro carro1 = new Carro(placa);
		System.out.println(carro1.placa);

		System.out.println("----------");
		Carro carro2 = new Carro(modelo, placa);
		System.out.println(carro2.modelo + ", " + carro2.placa);

		System.out.println("----------");
		Carro carro3 = new Carro(cor, modelo, placa);
		System.out.println(carro3.cor + ", " + carro3.modelo + ", " + carro3.placa);
		System.out.println("----------");
		
		
		System.out.println(carro1.ligar(nomeMotorista));		
	}

}
