package statico;

public class Carro {
	public static int contadorObjetos;

	private static int contador;
	
	public Carro() {
		contadorObjetos++;
		System.out.println("Objeto criado. Existem " + contadorObjetos + " Objetos dessa Classe.");
	}

	public static int getContador() {
		return contador;
	}
}
