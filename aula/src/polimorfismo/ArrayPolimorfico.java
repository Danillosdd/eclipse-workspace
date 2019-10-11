package polimorfismo;

public class ArrayPolimorfico {

	public void TestaArrayPolimorfico(Veiculo veiculo[]) {

		for (int i = 0; i < veiculo.length; i++) {

			if (veiculo[i] instanceof Carro) {

				veiculo[i].mover();
				System.out.println(
						"\nO Metodo mover está sendo chamado pela classe:  " + veiculo[i].getClass().getSimpleName());
				System.out.println("---------");

			}
		}

	}

}
