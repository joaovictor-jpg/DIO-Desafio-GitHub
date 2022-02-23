package one.digitalinnovation.oo.model;

public class Funcionario {

	String nome;
	String sobreNome;
	int idade;
	
	public Funcionario(String nome, String sobreNome, int idade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Sobre Nome: " + this.sobreNome + ", Idade: " + this.idade;
	}
}
