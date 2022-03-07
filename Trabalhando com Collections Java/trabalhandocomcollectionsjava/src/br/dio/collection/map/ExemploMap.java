package br.dio.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {

		/*
		 * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
		 * Modelo = gol - consumo = 14,4km/l Modelo = uno - consumo = 15,6km/l Modelo =
		 * mobi - consumo = 16,1km/l Modelo = hb20 - consumo = 14,5km/l Modelo = kwid -
		 * consumoe = 16,6km/l
		 */

		/*
		 * Map carrosPopulares2020 = new HashMap(); //antes do JAVA 5 Map<String,
		 * Double> carrosPopulares2020 = new HashMap<>(); //Genrecs (JDK5) - Diamant
		 * HashMap<String, Double> carrosPopulares2020 = new HashMap<>(); Map<String,
		 * Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1,
		 * "hb20", 14.5, "kwid", 16.6);
		 */

		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");

		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kwid", 16.6);
			}
		};
		System.out.println(carrosPopulares.toString());

		System.out.println("Substitua o consumo do gol por 15,2 km/l:");

		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares.toString());

		System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//		System.out.println("Exiba o terceiro modelo adicionado: ");

		System.out.println("Exiba os modelos: ");

		Set<String> modelo = carrosPopulares.keySet();
		for (String mdl : modelo) {
			System.out.println(mdl);
		}

		System.out.println("Exiba os consumos dos carros: ");

		Collection<Double> consumo = carrosPopulares.values();
		for (Double cso : consumo) {
			System.out.println(cso);
		}

		System.out.println("Exiba o modelo mais econômico e seu consumo: ");

		Double consumoMaisEficiene = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiene)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente);
				System.out.println("Consumo mais eficiente: " + consumoMaisEficiene);
			}
		}

		System.out.println("Exiba o modelo menos econômico e seu consumo: ");

		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String ModeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				ModeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + ModeloMenosEficiente);
				System.out.println("Consumo menos eficiente: " + consumoMenosEficiente);
			}
		}

		System.out.println("Exiba a soma dos consumos: ");
		
		Iterator<Double> itarator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(itarator.hasNext()) {
			soma += itarator.next();
		}
		System.out.println(soma);

		System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));
		
		System.out.println(carrosPopulares);
		System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
		
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carrosPopulares);

		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {
			{
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kwid", 16.6);
			}
		};
		System.out.println(carrosPopulares2);

		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		
		Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares3);

		System.out.println("Apague o dicionario de carros: ");
		
		carrosPopulares.clear();

		System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
	}

}
