package testes;

public class Construtor1 {
	
	int numero= 10;

	public Construtor1() {
		System.out.println("A");
		System.out.println("B");
	}

	public Construtor1(int numero) {

		this();
		System.out.println("C");
	}
	

}
