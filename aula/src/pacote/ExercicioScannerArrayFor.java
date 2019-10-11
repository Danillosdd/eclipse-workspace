package pacote;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioScannerArrayFor {
	public static void main(String[] args) {

		int count;

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEntre com o número de elementos que você quer no array: ");
		count = scan.nextInt();

		int num[] = new int[count];
		System.out.println("\nEntre com os elementos do array: ");

		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}

		scan.close();

		Arrays.sort(num);

		System.out.println("\nElementos do array em ordem ascendente: ");

		// for(int i = 0; i < count -1; i++) {
		// System.out.println(num[i]);
		// }

		System.out.println(Arrays.toString(num));
		
	}

}
