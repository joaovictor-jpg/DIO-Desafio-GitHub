package br.dio.collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
//		Dados uma Lista com 7 notas de um aluno { 7, 8.5, 9.3, 5, 7, 0, 3.6 }

//		set notas = new HashSet(); //antes do JAVA 5
//		set<Double> notas = new HashSet<>(); //Generics(JDK 5) Diamant Operator (JDK 7)
//		HashSet<Double> notas = new HashSet<>();
//		set<Double> notas = new HashSet<>(Arrays.asList( 7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
//		Set<Double> notas = Set.of( 7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//		notas.add(1d);
//		notas.remve(5d);
//		System.out.println(notas);

		System.out.println("Cria um conjunto e adciona as notas:");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());

//		System.out.println("Exiba a posição da nota 5.0");

//		System.out.println("Adcione na lista a nota 8.0 na posição 4:");

//		System.out.println("Substitua a nota 5.0 por 6.0:");

		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

//		System.out.println("Exiba a terceira nota adcionada:");

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		System.out.print("Exiba a soma dos valores: ");

		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.print(String.format("Exiba a soma dos valores: %.2f\n", soma));

		System.out.println(String.format("Exiba a média das notas: %.4f", (soma / notas.size())));

		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas.toString());

//		System.out.println("remova a nota da posição 0: ");

		System.out.println("Remova as notas menores que 7 e exiba a lista: ");

		Iterator<Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next < 7)
				iterator2.remove();
		}
		System.out.println(notas.toString());
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas");
		
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2.toString());
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3.toString());

		System.out.println("Apague todas as lista: ");
		notas.clear();

		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		System.out.println("Confira se a lista 2 está vazia: " + notas2.isEmpty());
		System.out.println("Confira se a lista 3 está vazia: " + notas3.isEmpty());

	}

}
