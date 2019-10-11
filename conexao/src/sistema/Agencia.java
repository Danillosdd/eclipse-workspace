package sistema;

import java.util.List;

public class Agencia {

	private String nome;
	private Banco banco;
	private List<Conta> contas;

	// nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// banco
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Banco getBanco() {
		return banco;
	}

	// contas
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public List<Conta> getContas() {
		return contas;
	}

}
