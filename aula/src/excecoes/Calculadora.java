package excecoes;

public class Calculadora {

	public static void main(String[] args) {

		Double nota1 = 5.0;
		Double nota2 = 3.0;

		
		try {
			System.out.println(Calculadora.calculaMedia(nota1, nota2));
		} catch (Exception e) {
			System.out.print("Tratamento de erro: ");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

	public static Double calculaMedia(Double x, Double y) throws Exception {

		Double media = (x + y) / 2;

		if (media < 6) {

			throw new Exception("Criando exceção com throws");
		}
		return media;

	}

}
