package pacote;

public class ExercicioWhileContinueBreak {
	public static void main(String[] args) {
		
		int contador = 0;
		
		while (true) {
			
			if (contador == 2) {
				System.out.println(contador + " continue- (while-true)");
				contador++;
				continue;
			}
			if (contador == 10) {
				System.out.println(contador + " break - (while-true)");
				break;
			}
			System.out.println(contador);
			contador++;

		}
	}

}
