package sistema;

public class Conta {
	
	private Cliente titular;
	private int numero;
	private int identificador;
	
	// titular
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular(Cliente titular) {
		return titular;
	}
	
	//numero
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero(int numero) {
		return numero;
	}
	
	//identificador
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public int getIdentificador(int identificador) {
		return identificador;
	}

}
