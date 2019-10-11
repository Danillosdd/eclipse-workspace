package heranca.veiculo;

//public final class SuperClasseVeiculo {
public  class SuperClasseVeiculo {

	// Atributos - Variáveis
	private String cor;
	private int ano;
	private String identificacao;

	// Construtor
	public SuperClasseVeiculo(String cor, int ano, String identificacao) {
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		System.out.println("Criando Objeto Veiculo(SuperClasse)");
	}

	// Metodos
	public void mover() {
		System.out.println("Veiculo se movendo");
	}

}
