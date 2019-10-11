package construtores;

public class Carro {

	public int ano;
	public String cor;
	public String modelo;
	public String placa;

	public Carro(String placa) {
		this.placa = (placa + " - Test");
	}

	public Carro(String modelo, String placa) {
		this.placa = placa;
		this.modelo = modelo;
	}

	public Carro(String cor, String modelo, String placa) {

		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
	}

	public String ligar(String nomeMotorista) {
		return nomeMotorista + ", Texto";
	}
}
