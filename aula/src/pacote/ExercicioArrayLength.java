package pacote;

public class ExercicioArrayLength {
	public static void main(String[] args) {
		
		int array[] = {40,45,36,74,90,61,74,88,91,54,22,9};
		
		System.out.println(array[0]);
		System.out.println(array[6]);
		System.out.println(array[array.length -1]);
		
		
		
		System.out.println("\n------------\n");
		
		System.out.println("O Tamanho do Array é: " + (array.length));//tamanho do array, não é a posição
		
		System.out.println("\n------------\n");
		
		for (int i : array) {

			System.out.println(i);
			//System.out.println(a[i]);
		}
	}

}
