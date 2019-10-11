package escopo;

public class EscopodeVariavel {
	public static void main(String[] args) {

		int var1 = 10;
		int var2;

		if (var1 < 100) {
			var2 = 20;
		} else {
			var2 = 21;
		}
	
		
		//Acesso a var1 é permitido, então não há erro de compilação
		System.out.println("Valor de var2 = " + var1);
		
		//Acesso a var2 não é permitido, então erro de compilação será gerado
		System.out.println("Valor de var2 = " + var2);
	}

}
