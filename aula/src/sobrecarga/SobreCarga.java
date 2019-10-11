package sobrecarga;

public class SobreCarga {

	public int ano;
	private String cor;
	private String modelo;
	private String placa;


public void print (String msg) {
	System.out.println(msg);
	print();
}

public void print () {
	System.out.println("Carro de Placa " + placa);
	System.out.println("Cor: " + cor);
	System.out.println("Modelo: " + modelo);
	System.out.println("Ano: " + ano);
}


}
