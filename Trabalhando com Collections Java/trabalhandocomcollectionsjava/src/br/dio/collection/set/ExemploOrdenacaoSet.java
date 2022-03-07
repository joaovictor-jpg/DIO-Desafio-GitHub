package br.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {

		System.out.println("---\tOrdem de Aleatória\t----");
		Set<Serie> minhaSeries = new HashSet<>() {
			{
				add(new Serie("gat", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that '70s show", "comédia", 25));
			}
		};

		for (Serie serie : minhaSeries) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}

		System.out.println("---\tOrdem de inserção\t---");

		Set<Serie> minhaSeries2 = new LinkedHashSet<>() {
			{
				add(new Serie("gat", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that '70s show", "comédia", 25));
			}
		};

		for (Serie serie : minhaSeries2) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}

		System.out.println("---\tOrdem Natural (tempoEspisodio)\t---");

		Set<Serie> minhaSeries3 = new TreeSet<>(minhaSeries2);

		for (Serie serie : minhaSeries3) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}

		System.out.println("---\tOrdem Nome/Gênero/TempoEpsodio/t---");

		Set<Serie> minhaSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

		minhaSeries4.addAll(minhaSeries2);

		for (Serie serie : minhaSeries4) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}

		System.out.println("---\tOrdem gênero\t---");

		Set<Serie> minhaSeries5 = new TreeSet<>(new ComparatorGenero());

		minhaSeries5.addAll(minhaSeries2);
		
		for (Serie serie : minhaSeries5) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}

		System.out.println("---\tOrdem Tempo de episódio\t---");

		Set<Serie> minhaSerie6 = new TreeSet<>(new ComparatorTempoEpisodio());

		minhaSerie6.addAll(minhaSeries2);

		for (Serie serie : minhaSerie6) {
			System.out.println("Nome: " + serie.getNome() + " Genero: " + serie.getGenero() + " Tempo: "
					+ serie.getTempoEspisodio());
		}
	}

}

class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEspisodio;

	public Serie(String nome, String genero, Integer tempoEspisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEspisodio = tempoEspisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEspisodio() {
		return tempoEspisodio;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEspisodio=" + tempoEspisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEspisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEspisodio, other.tempoEspisodio);
	}

	@Override
	public int compareTo(Serie o) {
		Integer genero = this.getGenero().compareTo(o.getGenero());
		Integer tempoEpisodio = Integer.compare(this.getTempoEspisodio(), o.getTempoEspisodio());
		if (tempoEpisodio != 0) {
			return tempoEpisodio;
		} else {
			return genero;
		}
	}

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {

		Integer nome = s1.getNome().compareTo(s2.getNome());
		Integer genero = s1.getGenero().compareTo(s2.getGenero());

		if (nome != 0) {
			return nome;
		} else if (genero != 0) {
			return genero;
		} else {
			return Integer.compare(s1.getTempoEspisodio(), s2.getTempoEspisodio());
		}
	}

}

class ComparatorGenero implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		return s1.getGenero().compareTo(s2.getGenero());
	}

}

class ComparatorTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		return Integer.compare(s1.getTempoEspisodio(), s2.getTempoEspisodio());
	}

}
