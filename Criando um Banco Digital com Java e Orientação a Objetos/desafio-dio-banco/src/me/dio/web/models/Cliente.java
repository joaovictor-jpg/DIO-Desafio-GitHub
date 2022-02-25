package me.dio.web.models;

public class Cliente {

	private String nome;
	private String cpf;
	private String professao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfessao() {
		return professao;
	}

	public void setProfessao(String professao) {
		this.professao = professao;
	}
	
}
