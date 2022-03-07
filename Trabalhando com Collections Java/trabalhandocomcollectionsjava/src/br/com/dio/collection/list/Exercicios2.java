package br.com.dio.collection.list;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {

		Scanner csn = new Scanner(System.in);

		List<String> resposta = new ArrayList<>();

		System.out.println("Responda somente Sim ou Nao:");

		System.out.println("Telefonou para vítima");
		resposta.add(csn.next());

		System.out.println("Esteve no local do crime?");
		resposta.add(csn.next());

		System.out.println("Mora perto da vítima");
		resposta.add(csn.next());

		System.out.println("Devia para a vítima");
		resposta.add(csn.next());

		System.out.println("já trabalhou com a vítima");
		resposta.add(csn.next());

		Integer soma = 0;

		for (String charset : resposta) {
			if (charset.equalsIgnoreCase("sim")) {
				soma++;
			}
			;
		}
		;
		
		teste(soma);

	};

	public static void teste(Integer inteiro) {

		switch (inteiro) {
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;
		default:
			System.out.println(">> INOCENTE <<");
			break;
		}
		;

	};
}