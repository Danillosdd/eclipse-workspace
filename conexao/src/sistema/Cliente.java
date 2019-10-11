package sistema;

public class Cliente {

	private int codigo;
	private String nome;
	private String login;
	private String senha;
	private String endereco;
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;

	//codigo
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	
	//nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//login
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	//senha
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	//endereco
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	//cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	//bairro
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	//estado
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	//cep
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}

	@Override
	public String toString() {
		return "Resultado da Consulta de Cliente [codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", endereco="
				+ endereco + ", cidade=" + cidade + ", bairro=" + bairro + ", estado=" + estado + ", cep=" + cep + "]";
	}
	
	
	
}
