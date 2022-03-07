package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {

		List<Gato> meusGato = new ArrayList<>() {
			{
				add(new Gato("Jhon", 18, "Preto"));
				add(new Gato("Simba", 6, "Tigrado"));
				add(new Gato("Jhon", 12, "Amarelo"));
			}
		};

		System.out.println("---\tOrdem de Inserção\t----");
		System.out.println(meusGato);

		System.out.println("---\tOrdem Aleatório\t---");
		Collections.shuffle(meusGato);
		System.out.println(meusGato);

		System.out.println("---\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGato);
		System.out.println(meusGato);

		System.out.println("---\tOrdem Idade/t---");
//		Collections.sort(meusGato, new ComparatoIdade());
		meusGato.sort(new ComparatoIdade());
		System.out.println(meusGato);

		System.out.println("---\tOrdem cor\t---");
//		Collections.sort(meusGato, new ComparatoCor());
		meusGato.sort(new ComparatoCor());
		System.out.println(meusGato);

		System.out.println("---\tOrdem nome/cor/idade\t---");
//		Collections.sort(meusGato, new ComparatoNomeIdadeCor());
		meusGato.sort(new ComparatoNomeIdadeCor());
		System.out.println(meusGato);
	}

}

class Gato implements Comparable<Gato> {

	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}

class ComparatoIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}

}

class ComparatoCor implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}

}

class ComparatoNomeIdadeCor implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

		if (nome != 0)
			return nome;

		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

		if (cor != 0)
			return cor;

		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}
