package pacote;

public class OperadoresRelacionais {
	public static void main(String[] args) {

		int var1 = 4;
		int var2 = 9;

		System.out.println("Var1: " + var1);
		System.out.println("Var2: " + var2);
		System.out.println("");
		System.out.println(var1 + " é Maior que " + var2 + ": " + (var1 > var2));
		System.out.println(var1 + " Maior ou igual " + var2 + ": " + (var1 >= var2));
		System.out.println(var1 + " Menor que " + var2 + ": " + (var1 < var2));
		System.out.println(var1 + " Menor ou igual " + var2 + ": " + (var1 <= var2));
		System.out.println(var1 + " é Igual a " + var2 + ": " + (var1 == var2));
		System.out.println(var1 + " Diferente " + var2 + ": " + (var1 != var2));
	}

}
