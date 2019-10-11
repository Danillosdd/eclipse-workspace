package pacote;

/*
public class ExercicioNumerosPares {
	public static void main(String[] args) {
		
		int contador = 1;
		
		while (contador < 100) {
			System.out.println(contador);
			contador = (contador + 2);
		}
	}

}
*/

public class ExercicioNumerosPares {
	public static void main(String[] args) {

		int contador = 1;

		while (contador < 100) {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
			contador++;

		}

	}
}
