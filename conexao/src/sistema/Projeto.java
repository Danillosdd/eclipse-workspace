package sistema;

import java.util.List;

public class Projeto {

	private String nome;
	private String descricao;
	private List<Funcionario> funcionarios;

	// nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	// funcionario
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
