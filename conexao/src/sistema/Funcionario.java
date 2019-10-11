package sistema;

import java.util.List;

public class Funcionario {

	private String nome;
	private List<Projeto> projetos;

	// nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// projetos
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

}
