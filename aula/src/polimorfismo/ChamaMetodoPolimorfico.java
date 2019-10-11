package polimorfismo;

public class ChamaMetodoPolimorfico {

	public static void main(String[] args) {

		MetodoPolimorfico teste = new MetodoPolimorfico();

		// Veiculo varveiculo = new Veiculo();
		Carro varCarro = new Carro();
		Aviao carAviao = new Aviao();
		Barco carBarco = new Barco();

		teste.testarChamadaHeranca(varCarro);
		teste.testarChamadaHeranca(carAviao);
		teste.testarChamadaHeranca(carBarco);
	}

}
