package pacote;

public class ExercicioArrayLengthDouble {
	public static void main(String[] args) {

		double array[] = { 19, 12.89, 16.5, 200, 13.7 };
		double total = 0;

		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}

		double media = total / array.length;

		System.out.format("A média é: %.3f", media);
	}

}
