package pacote;

public class ExercicioForBreak {
	public static void main(String[] args) {

		for (int contador = 0; contador < 10; contador++) {

			if (contador == 6) {
				System.out.println(contador + "\nBreak");
				break;
			}
			System.out.println(contador);
		}
	}

}
