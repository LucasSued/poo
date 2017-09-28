package br.fiap.contato;

public class Contato {
	private String nome;
	private String email;
	private String endereco;
	private String nascimento;
	
	
	public Contato(String nome, String email, String endereco, String nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.nascimento = nascimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

}
