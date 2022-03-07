package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicios {

	public static void main(String[] args) {

		System.out.println(
				"1-Faça umprograma que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista");
		List<Integer> temperaturas = new ArrayList<>() {
			{
				add(33);
				add(35);
				add(35);
				add(36);
				add(33);
				add(32);
			}
		};
		System.out.println(temperaturas.toString());

		System.out.println(
				"2-Calcule a média semestral das temperatura e mostre todas as temperaturas acima desta média:");
		Iterator<Integer> iterator = temperaturas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		}
		Double media = soma / temperaturas.size();
		System.out.println(String.format("Média %.2f", media));

		Integer i = 0;

		for (Integer integer : temperaturas) {
			if (media < integer) {
				switch (i) {
				case 1:
					System.err.println(integer);
					System.out.println(String.format("%d - Janeiro", i));
					break;
				case 2:
					System.err.println(integer);
					System.out.println(String.format("%d - Fevereiro", i));
					break;
				case 3:
					System.err.println(integer);
					System.out.println(String.format("%d - Março", i));
					break;
				case 4:
					System.err.println(integer);
					System.out.println(String.format("%d - Abril", i));
					break;
				case 5:
					System.err.println(integer);
					System.out.println(String.format("%d - Maio", i));
					break;
				case 6:
					System.err.println(integer);
					System.out.println(String.format("%d - Junho", i));
					break;
				default:
					System.err.println("Mês inválido");
					break;
				}
			}
			i++;
		}
	}

}
