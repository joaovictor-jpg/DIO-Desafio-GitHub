package br.dio.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

	/*
	 * Dadas as seguintes informações sobre seus livros favoritos e seus autores,
	 * crie um dicionario e ordene esse dicionario; exiba (nome Autor - Nome Livro);
	 * 
	 * Autor = Hawking, Stephen - livro = nome: Uma Breve História do tempo,
	 * paginas: 256 Autor = Duhigg, Charles - livro = nome: O poder do Hábito,
	 * paginas: 408 Autor = Harari, Yuval - livro = nome: 21 Lições para o século
	 * 21, paginas: 432
	 */

	public static void main(String[] args) {

		System.out.println("--\tOrdem aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve História do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Harari, Yuval", new Livro("21 Lições para o século 21", 432));
			}
		};

		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + "- " + livro.getValue().getNome());
		}

		System.out.println("--\tOrdem Inserção\t--");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve História do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Harari, Yuval", new Livro("21 Lições para o século 21", 432));
			}
		};

		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + "- " + livro.getValue().getNome());
		}

		System.out.println("--\tOrdem alfabética autores\t--");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);

		for (Map.Entry<String, Livro> entry : meusLivros3.entrySet()) {
			System.out.println(entry.getKey() + "- " + entry.getValue().getNome());
		}

		System.out.println("--\tOrdem alfabética nomes dos livros\t--");

		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparaTorNome());
		meusLivros4.addAll(meusLivros.entrySet());
		for (Entry<String, Livro> entry : meusLivros4) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

        System.out.println("--\tOrdem número de página\t--"); //Pra você
		Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparaTorNumeroDePaginas());
		meusLivros5.addAll(meusLivros4);
		for (Entry<String, Livro> entry : meusLivros4) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getPaginas());
		}
	}

}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return " nome= " + getNome() + ", paginas= " + getPaginas();
	}
}

class ComparaTorNome implements Comparator<Map.Entry<String, Livro>> {
	@Override
	public int compare(Entry<String, Livro> obj1, Entry<String, Livro> obj2) {
		return obj1.getValue().getNome().compareToIgnoreCase(obj2.getValue().getNome());
	}
}

class ComparaTorNumeroDePaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> obj1, Entry<String, Livro> obj2) {
		return Integer.compare(obj1.getValue().getPaginas(), obj2.getValue().getPaginas());
	}
	
}
