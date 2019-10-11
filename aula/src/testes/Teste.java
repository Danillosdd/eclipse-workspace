package testes;

public class Teste {

	public static void main(String[] args) {

		int[] idades = { 10, 11, 12 };

		for (int i : idades) {
			System.out.println(i);
		}

		teste(idades);

		System.out.println("-----------");
		for (int i : idades) {
			System.out.println(i);
		}

	}

	public static void teste(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 50;
		}
	}
}
