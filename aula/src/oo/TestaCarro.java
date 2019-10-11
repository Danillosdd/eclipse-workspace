package oo;

public class TestaCarro {
	public static void main(String[] args) {

		Carro carro1 = new Carro();

		System.out.println("--------------\n");
		// System.out.println(carro1.ligar());
		// System.out.println(carro1.frear());
		carro1.frear();
		System.out.println(carro1.acelerar());

		System.out.println("--------------\n");
	}

}
