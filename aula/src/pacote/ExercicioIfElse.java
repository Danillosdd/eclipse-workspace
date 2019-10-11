package pacote;

public class ExercicioIfElse {
	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 70;
		int num3 = 18;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o Maior Número!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o Maior Número!");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " é o Maior Número!");
		} else {
			System.out.println("#Error");
		}

	}
}
