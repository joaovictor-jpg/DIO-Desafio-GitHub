package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemplosList {

	public static void main(String[] args) {
		// Formas de criar uma ArrayList :

//		List notas = new ArrayList(); antes do java 5
//		List<Double> notas = new ArrayList<Double>(); Generics(jdk 5)
//		ArrayList<Double> notas = new ArrayList<>();
//		List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//		List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//		notas.add(10d); erro
//		System.out.println(notas);
//		List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//		notas.add(1d);
//		notas.remove(o:5d);
//		System.out.println(notas);

		System.out.println("Crie uma Lista e adcione as sete notas: ");
		
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		
		System.out.println(notas.toString());
		
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas.toString());
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5d), 6d);
		System.out.println(notas.toString());
		
		System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));
		
//		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//		for (Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adcionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.print("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		
		System.out.println("Exiba a média das notas: " + (soma / notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(notas.indexOf(0d));
		System.out.println(notas);
		
		System.out.println("remova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Apague todas as lista: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
//		------------------------- Exercícios ----------------------------------------
		System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da lista: ");
		List<Double> notas2 = new LinkedList<Double>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2.toString());
		
		System.out.println("Mostre o primeira nota da lista sem removê-lo: " + notas2.get(0));
		
		System.out.println("Mostre a primeira nota da nova lista removendo-o?");
		Double nota2 = notas2.get(0);
		notas2.remove(notas2.get(0));
		System.out.println("Mostre a primeira nota da nova lista removendo-o " + nota2);
		System.out.println(notas2.toString());
	}

}
