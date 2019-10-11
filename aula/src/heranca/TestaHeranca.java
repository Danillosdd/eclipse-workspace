package heranca;

public class TestaHeranca {
	public static void main(String[] args) {
		
		SubClasseEngenheiro Engenheiro = new SubClasseEngenheiro();
		SubClasseDiretor Diretor = new SubClasseDiretor();
		SubClasseSecretario Secretario = new SubClasseSecretario();
		SubClasseGerente Gerente = new SubClasseGerente();
		
		System.out.println(Engenheiro.nome);
		System.out.println(Diretor.nome);
		System.out.println(Secretario.nome);
		System.out.println(Gerente.nome);
		
	}

}
