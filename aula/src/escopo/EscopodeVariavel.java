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
	
		
		//Acesso a var1 � permitido, ent�o n�o h� erro de compila��o
		System.out.println("Valor de var2 = " + var1);
		
		//Acesso a var2 n�o � permitido, ent�o erro de compila��o ser� gerado
		System.out.println("Valor de var2 = " + var2);
	}

}
