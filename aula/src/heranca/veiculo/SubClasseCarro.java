package heranca.veiculo;

public class SubClasseCarro extends SuperClasseVeiculo{
	
	private String modelo;
	
	public SubClasseCarro (String cor, int ano, String placaIdentificacao, String modelo) {
		
		super(cor, ano, placaIdentificacao);
		this.modelo = modelo;
		
		System.out.println("Criando Objeto Carro(SubClasse)");
		
	}
	
	@Override
	public void mover() {
		System.err.println("Correr");
	}
	

}
