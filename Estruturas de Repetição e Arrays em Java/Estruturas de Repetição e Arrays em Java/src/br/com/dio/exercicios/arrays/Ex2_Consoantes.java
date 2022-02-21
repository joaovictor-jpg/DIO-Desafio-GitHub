package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char[] consoate = new char[6];
		int quantidadeDeConsoatens;

		System.out.println("Entre com uma letra:");
		
		for (int i = 0; i < consoate.length; i++) {
			consoate[i] = scn.next().charAt(0);
		}
		
		quantidadeDeConsoatens = contadorDeCosoantes(consoate);
		System.out.println("quantidade de cosoantes: " + quantidadeDeConsoatens);
	}

	public static int contadorDeCosoantes(char[] vetor) {
		int quantidadeConsoantes = 0;

		for (char letra : vetor) {

			if (!(Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e'
					|| Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o'
					|| Character.toLowerCase(letra) == 'u')) {
				System.out.println("Letra: " + letra);
				quantidadeConsoantes++;
			}

		}

		return quantidadeConsoantes;
	}
}
