package statico;

public class TresTipoDeVariaveis {
	
	//Exemplo de variável estática
	static String staticVariable = "Variavel de classe, ou estatica";
	
	//Exemplo de variável de instância
	String instanceVariable = "variavel de instancia";
	
	public static void main(String[] args) {
		
		TresTipoDeVariaveis instanceVariable = new TresTipoDeVariaveis();
		
		String localVariable = "variavel local";
		
		System.out.println("Variavel estatica =" + staticVariable);
		System.out.println("Variavel de instancia = " + instanceVariable);
		System.out.println("Variavel local = " + localVariable);
	}

}
