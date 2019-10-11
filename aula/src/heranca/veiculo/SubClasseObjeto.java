package heranca.veiculo;

public class SubClasseObjeto {
	
	public static void main(String[] args) {
		
		String cor = "Azul";
		int ano = 2019;
		String placaIdentificacao = "OMS-3744";
		String modelo = "Fiat";
		
		
		SubClasseCarro objeto = new SubClasseCarro(cor, ano, placaIdentificacao, modelo);
		
		objeto.mover();
	}

}
