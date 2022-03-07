package br.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Exercicios2 {

	public static void main(String[] args) {

		Set<LinguagemFavorita> conjunto = new HashSet<>() {
			{
				add(new LinguagemFavorita("JAVA", 2021, "Eclipse"));
				add(new LinguagemFavorita("JavaScript", 2021, "VSCode"));
				add(new LinguagemFavorita("C#", 2021, "Visual Studio"));
			}
		};

		for (LinguagemFavorita linguagemFavorita : conjunto) {
			System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCricao() + " - "
					+ linguagemFavorita.getIde());
		}

		System.out.println("1 - Ordem de inserção;");
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<>() {
			{
				add(new LinguagemFavorita("JAVA", 2021, "Eclipse"));
				add(new LinguagemFavorita("JavaScript", 2021, "VSCode"));
				add(new LinguagemFavorita("C#", 2019, "Visual Studio"));
			}
		};
		for (LinguagemFavorita linguagemFavorita : linguagens) {
			System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCricao() + " - "
					+ linguagemFavorita.getIde());
		}

		System.out.println("2 - Ordem Natural:");
		Set<LinguagemFavorita> conjunFavoritas = new TreeSet<LinguagemFavorita>(conjunto);
		for (LinguagemFavorita linguagemFavorita : conjunFavoritas) {
			System.out.println(linguagemFavorita.toString());
		}

		System.out.println("3 - Ordena por IDE:");
		Set<LinguagemFavorita> conjunFavoritasIde = new TreeSet<>(new comparetoIde());

		conjunFavoritasIde.addAll(conjunFavoritas);

		for (LinguagemFavorita linguagemFavorita : conjunFavoritasIde) {
			System.out.println(linguagemFavorita.toString());
		}

		System.out.println("4 - Ordem ano de criação e nome");
		Set<LinguagemFavorita> conjunFavoritasAnoENome = new TreeSet<>(new comparetoAnoDeCriacaoENome());

		conjunFavoritasAnoENome.addAll(linguagens);

		for (LinguagemFavorita linguagemFavorita : conjunFavoritasAnoENome) {
			System.out.println(linguagemFavorita.toString());
		}
		
		System.out.println("4 - Ordem ano de criação e nome");
		Set<LinguagemFavorita> conjunFavoritasAnoNomeEIde = new TreeSet<>(new comparetoAnoDeCriacaoNomeEIde());

		conjunFavoritasAnoNomeEIde.addAll(linguagens);

		for (LinguagemFavorita linguagemFavorita : conjunFavoritasAnoNomeEIde) {
			System.out.println(linguagemFavorita.toString());
		}
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	private String nome;
	private Integer anoDeCricao;
	private String ide;

	public LinguagemFavorita(String nome, Integer anoDeCricao, String ide) {
		this.nome = nome;
		this.anoDeCricao = anoDeCricao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoDeCricao() {
		return anoDeCricao;
	}

	public String getIde() {
		return ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeCricao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoDeCricao, other.anoDeCricao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(LinguagemFavorita obj) {

		return this.getNome().compareToIgnoreCase(obj.getNome());
	}

	@Override
	public String toString() {
		return "LinguagemFavorita [nome=" + nome + ", anoDeCricao=" + anoDeCricao + ", ide=" + ide + "]";
	}
}

class comparetoIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita obj1, LinguagemFavorita obj2) {
		return obj1.getIde().compareToIgnoreCase(obj2.getIde());
	}
}

class comparetoAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita obj1, LinguagemFavorita obj2) {
		Integer ano = Integer.compare(obj1.getAnoDeCricao(), obj2.getAnoDeCricao());
		Integer nome = obj1.getNome().compareToIgnoreCase(obj2.getNome());
		if (ano != 0) {
			return ano;
		}
		return nome;
	}
}

class comparetoAnoDeCriacaoNomeEIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita obj1, LinguagemFavorita obj2) {
		Integer ano = Integer.compare(obj1.getAnoDeCricao(), obj2.getAnoDeCricao());
		Integer nome = obj1.getNome().compareToIgnoreCase(obj2.getNome());
		if (nome != 0) {
			return nome;
		} else if (ano != 0) {
			return ano;
		}
		return obj1.getIde().compareToIgnoreCase(obj2.getIde());
	}
}