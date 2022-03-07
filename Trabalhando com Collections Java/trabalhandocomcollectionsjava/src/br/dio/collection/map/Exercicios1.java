package br.dio.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 * Estado = PE - população = 9.616.621
 * Estado = AL - população = 3.351.543
 * Estado = CE - população  = 9.187.103
 * Estado = RN - população = 3.534.265
 */

public class Exercicios1 {

	public static void main(String[] args) {

		System.out.println("1 - Cria um dicionario e rlacione os estados e suas população: ");
		Map<String, Double> estados = new HashMap<>() {
			{
				put("PE", 9.616621);
				put("AL", 3.351543);
				put("CE", 9.187103);
				put("RN", 3.534265);
			}
		};
		System.out.println(estados.toString());

		System.out.println("2 - Substitua a população do estado de RN por 3.534.164");
		estados.put("RN", 3.534164);
		System.out.println(estados.toString());

		System.out.println("3 - Confira se o estado PB está no dicionário, caso não adcione: PB = 4.039.277");
		if (!estados.containsKey("PB")) {
			estados.put("PB", 4.039277);
		}
		System.out.println(estados.toString());

		System.out.println("4 - Exiba a população de PE: " + estados.get("PE"));

		System.out.println("5 - Exiba os estados e suas populações na ordem que foi informado:");
		Map<String, Double> estados2 = new LinkedHashMap<>() {
			{
				put("PE", 9.616621);
				put("AL", 3.351543);
				put("CE", 9.187103);
				put("RN", 3.534265);
				put("PB", 4.039277);
			}
		};
		System.out.println(estados2.toString());

		System.out.println("6 - Exiba os estados em ordem alfabética:");
		Map<String, Double> estados3 = new TreeMap<>(estados2);
		System.out.println(estados3.toString());

		System.out.println("7 - Exiba os estados e sua quantidade:");
		Double value = Collections.min(estados3.values());
		for (Map.Entry<String, Double> entry : estados3.entrySet()) {
			if (entry.getValue() == value) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		
		System.out.println("8 - Exiba o estado com o maior população e sua quantidade");
		value = Collections.max(estados3.values());
		for (Map.Entry<String, Double> entry : estados3.entrySet()) {
			if (entry.getValue() == value) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		
		System.out.println("9 - Exiba o soma da populção desses estados:");
		Iterator<Double> iterato = estados3.values().iterator();
		double soma = 0d;
		while(iterato.hasNext()) {
			soma += iterato.next();
		}
		System.out.println(soma);
		
		System.out.println("10 - Exiba a média da população desses estados:");
		System.out.println(soma/estados3.size());
		
		System.out.println("Remova os estados com a populçao menor que 4.000.000:");
		Iterator<Double> it = estados3.values().iterator();
		while(it.hasNext()) {
			if(it.next() < 4.000000) {
				it.remove();
			}
		}
		System.out.println(estados3.toString());
		
		System.out.println("10 - Remova o dicionario de estado:");
		estados3.clear();
		
		System.out.println("11 - Confira se o dicionário está vazio: " + estados3.isEmpty());
	}

}
