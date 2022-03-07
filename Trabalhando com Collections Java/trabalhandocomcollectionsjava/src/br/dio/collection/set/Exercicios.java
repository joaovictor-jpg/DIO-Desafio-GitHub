package br.dio.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicios {

	public static void main(String[] args) {

		Set<String> corDoArcoires = new HashSet<>() {
			{
				add("Violeta");
				add("Anil");
				add("Azul");
				add("Verde");
				add("Amarelo");
				add("Laranja");
				add("Vemelho");
			}
		};

		System.out.println("1 - Exiba todas as cores uma abaixo da outra:");
		for (String cor : corDoArcoires) {
			System.out.println(cor);
		}

		System.out.println("2 - A quantidade de cores que o arco-íres tem:");
		System.out.println(corDoArcoires.size());

		System.out.println("3 - Exiba as cores em ordem alfabética:");
		Set<String> corDoArcoires2 = new TreeSet(corDoArcoires);
		for (String cor : corDoArcoires2) {
			System.out.println(cor);
		}

		System.out.println("4 - Exiba as cores na ordem inversa da que foi informado:");
		List<String> coresDoArcoires = new ArrayList<>(corDoArcoires);
		Collections.reverse(coresDoArcoires);
		System.out.println(coresDoArcoires.toString());

		System.out.println("5 - Exiba as cores que comece com a letra V:");
		for (String cores : corDoArcoires) {
			if (cores.startsWith("V", 0)) {
				System.out.println(cores);
			}
		}

		System.out.println("6 - Remova todas as cores que não começe com a letra V:");
		Iterator<String> iterator2 = corDoArcoires.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(corDoArcoires.toString());
        
        System.out.println("7 - Limpe o conjunto:");
        corDoArcoires.clear();
        
        System.out.println("8 - Confira se o conjunto está vazio:");
        System.out.println(corDoArcoires);
	}
}
