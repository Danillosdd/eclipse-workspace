package pacote;

public class ExercicioWhileBreak {
	public static void main(String[] args) {
		int contador = 0;

		while (true) {
			if (contador == 10) {
				System.out.println("break");
				break;

			}
			System.out.println(contador);
			contador++;

		}
	}

}
