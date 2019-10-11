package polimorfismo;

public class ChamadaPolimorfico {

	public static void main(String[] args) {

		Carro carros[] = new Carro[3];

		carros[0] = new Carro();
		carros[1] = new Carro();
		carros[2] = new Carro();

		Barco barcos[] = new Barco[2];

		barcos[0] = new Barco();
		barcos[1] = new Barco();

		Aviao aviao[] = new Aviao[2];

		aviao[0] = new Aviao();
		aviao[1] = new Aviao();

		Veiculo veiculo[] = new Veiculo[3];

		veiculo[0] = new Carro();
		veiculo[1] = new Barco();
		veiculo[2] = new Aviao();

		// Array
		ArrayPolimorfico arrayVeiculo = new ArrayPolimorfico();

		//arrayVeiculo.TestaArrayPolimorfico(carros);
		arrayVeiculo.TestaArrayPolimorfico(veiculo);

	}
}
