package testes;

public class ClasseEstatica {
	
	static int contadorObjetos = 1;

	public ClasseEstatica() {
		contadorObjetos++;

	}

	public static void metodo() {
		
		System.out.println("Hello");

	}

}
