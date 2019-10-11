package polimorfismo;

public class Testa {

	public static void main(String[] args) {

		Veiculo veiculo = new Carro();
		veiculo.mover();
		//Correr

		veiculo = new Aviao();
		veiculo.mover();
		//Voar

		veiculo = new Barco();
		veiculo.mover();
		//Navegar

	}

}
