package oo;

public class Carro {

	// (1) Atributos - Vari�veis
	// private int ano;
	// private String cor;
	// private String modelo;
	// private String placa;

	private Boolean ligado;

	// (2) Construtor
	public Carro() {
		System.out.println("Criando objeto Carro");
		ligado = false;
	}

	// (3) M�todos
	public void ligar() {
		// return "ligado";
		// System.out.println("ligado");
		// return "\nRetorno do Metodo Ligar\n";

		String retorno;

		if (ligado == false) {
			ligado = true;
			retorno = "Ligando o Carro";
			System.out.println(retorno);
		} else {
			retorno = "Carro Ja est� ligado";
			System.out.println(retorno);
		}

		// return retorno;
	}

	public void frear() {
		System.out.println("parado");
		// return "parado..";
	}

	public String acelerar() {
		return "acelerando...";
	}

}
