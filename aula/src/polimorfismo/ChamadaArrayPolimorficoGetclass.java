package polimorfismo;

public class ChamadaArrayPolimorficoGetclass {

	public static void main(String[] args) {

		Veiculo veiculo[] = new Veiculo[3];

		veiculo[0] = new Carro();
		veiculo[1] = new Barco();
		veiculo[2] = new Aviao();

		System.out.println(veiculo[0].getClass().getSimpleName());
		System.out.println(veiculo[1].getClass().getSimpleName());
		System.out.println(veiculo[2].getClass().getSimpleName());

		System.out.println("\n-----------------\n");

		System.out.println(veiculo[0] instanceof Carro);
		System.out.println(veiculo[1] instanceof Barco);
		System.out.println(veiculo[2] instanceof Aviao);

	}

}
