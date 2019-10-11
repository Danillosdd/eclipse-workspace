package interfaces;

public class Calculadora implements Calculos {

	@Override
	public Double soma(Double x, Double y) {
		return x + y;
	}

	@Override
	public Double subtracao(Double x, Double y) {
		return x - y;
	}

	@Override
	public Double multiplicacao(Double x, Double y) {
		return x * y;
	}

	// main
	public static void main(String[] args) {

		Calculadora var = new Calculadora();

		System.out.printf("%.2f\n",var.soma(10.00, 20.00));
		
		System.out.printf("%.2f\n",var.subtracao(30.00, 20.00));

		System.out.printf("%.2f\n",var.multiplicacao(20.00, 20.00));

	}
}
