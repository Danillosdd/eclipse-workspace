package statico;

public class TresTipoDeVariaveis {
	
	//Exemplo de vari�vel est�tica
	static String staticVariable = "Variavel de classe, ou estatica";
	
	//Exemplo de vari�vel de inst�ncia
	String instanceVariable = "variavel de instancia";
	
	public static void main(String[] args) {
		
		TresTipoDeVariaveis instanceVariable = new TresTipoDeVariaveis();
		
		String localVariable = "variavel local";
		
		System.out.println("Variavel estatica =" + staticVariable);
		System.out.println("Variavel de instancia = " + instanceVariable);
		System.out.println("Variavel local = " + localVariable);
	}

}
