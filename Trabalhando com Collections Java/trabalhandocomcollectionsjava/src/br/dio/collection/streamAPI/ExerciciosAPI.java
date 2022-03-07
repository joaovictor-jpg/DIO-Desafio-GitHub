package br.dio.collection.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExerciciosAPI {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1", "8", "4", "1", "2", "3", "9", "9", "6", "5");

		System.out.println("Imprima todos os elementos dessa lista de String: ");
		numerosAleatorios.forEach(System.out::println);

		System.out.println("Pegue os 5 primeiros n�meros e coloque dentro de um Set:");
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println("Transforme esta lista de String em uma lista de n�meros inteiros.");
		Collection<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
				.collect(Collectors.toList());

		System.out.println("Pegue os n�meros pares e maiores que 2 e coloque em uma lista:");
		List<Integer> listParMaiorQue2 = numerosAleatorios.stream().map(Integer::parseInt)
				.filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
		System.out.println(listParMaiorQue2.toString());

		System.out.println("Mostre a m�dia dos n�meros: ");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

		System.out.println("Remova os valores �mpares: ");
		List<Integer> numerosAleatorios2 = numerosAleatorios.stream().map(Integer::parseInt)
				.collect(Collectors.toList());
		numerosAleatorios2.removeIf(t -> (t % 2 != 0));
		System.out.println(numerosAleatorios2);

//	        Para voc�
		System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
		numerosAleatorios.stream().skip(3).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.print("Mostre o menor valor da lista: ");
		Optional<Integer> menorNumero = numerosAleatorios.stream().map(Integer::parseInt)
				.min(Comparator.naturalOrder());
		System.out.println(menorNumero);

		System.out.print("Mostre o maior valor da lista: ");
		Optional<Integer> maiorNumero = numerosAleatorios.stream().map(Integer::parseInt)
				.max(Comparator.naturalOrder());
		System.out.println(maiorNumero);

		System.out.println("Mostre a lista na ordem n�merica: ");
		List<String> numerosOrdemNatural = numerosAleatorios.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println(numerosOrdemNatural);

		System.out.println("Agrupe os valores �mpares m�ltiplos de 3 ou de 5:");
		// dica: collect(Collectors.groupingBy(new Function());
		Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
				.collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
		System.out.println(collectNumerosMultiplosDe3E5);
	}
}
