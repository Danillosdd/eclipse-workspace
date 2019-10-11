package pacote;

public class converterWrapper {
	public static void main(String[] args) {
		Integer velocidade = new Integer(587);

		double total = velocidade.doubleValue();
		//short total1 = velocidade.shortValue();
		//byte total2 = velocidade.byteValue();

		Float pi = new Float(3.14);
		int valorPi = pi.intValue();

		System.out.println("Valor de PI arredondado: " + valorPi);
		System.out.println("Total: " + total);

	}

}
