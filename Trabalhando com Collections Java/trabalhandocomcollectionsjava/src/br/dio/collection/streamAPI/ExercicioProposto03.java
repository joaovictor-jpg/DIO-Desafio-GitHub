package br.dio.collection.streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioProposto03 {

	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {
			{
				put(1, new Contato("Simba", 5555));
				put(4, new Contato("Cami", 1111));
				put(3, new Contato("Jhon", 2222));
			}
		};
		System.out.println(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("--\tOrdem Inserção\t--");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
			{
				put(1, new Contato("Simba", 5555));
				put(4, new Contato("Cami", 1111));
				put(3, new Contato("Jon", 2222));
			}
		};
		System.out.println(agenda1);
		for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("--\tOrdem id\t--");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		System.out.println(agenda2);
		for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("--\tOrdem número telefone\t--");
		// precisamos organizar os valores. Logo:
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
			@Override
			public int compare(Entry<Integer, Contato> obj1, Entry<Integer, Contato> obj2) {
				return Integer.compare(obj1.getValue().getNumero(), obj2.getValue().getNumero());
			}
		});
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out
					.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
		}

		System.out.println("--\tOrdem nome contato\t--");
		// precisamos organizar os valores. Logo:
//		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(
//				Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
//					@Override
//					public String apply(Entry<Integer, Contato> cont) {
//						return cont.getValue().getNome();
//					}
//				}));
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(
				Comparator.comparing(cont -> cont.getValue().getNome()));
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
	}
}
