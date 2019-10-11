package testes;

public class PrimeiroMetodo {

	SegundoMetodo metodo2 = new SegundoMetodo();

	public void metodo1() {
		System.out.println("Primeiro Metodo");
		metodo2.metodo2();
		System.out.println("Depois da Chamada do Metodo2");
	}

	int a;

}
