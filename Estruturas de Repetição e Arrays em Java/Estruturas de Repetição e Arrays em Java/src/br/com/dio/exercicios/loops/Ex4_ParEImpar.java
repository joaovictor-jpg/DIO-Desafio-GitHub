package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite a quantidade:");
		int quantNumeros = scn.nextInt();
		int numero;
		int somaPar = 0, somaImp = 0;

		do {
			System.out.println("Digite um número:");

			numero = scn.nextInt();
			if (numero % 2 == 0) {
				somaPar++;
			} else {
				somaImp++;
			}
			quantNumeros--;
		} while (quantNumeros > 0);
		
		System.out.println("Número par digitador foram: " + somaPar);
		System.out.println("Número impar digitador foram: " + somaImp);
	}

}
