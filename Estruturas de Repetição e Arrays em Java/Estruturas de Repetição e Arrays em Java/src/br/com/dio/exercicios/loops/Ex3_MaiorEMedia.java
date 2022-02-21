package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] numero = new int[5];
		int maiorNumero = 0;
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira numero "+i+ ":");
			numero[i] = scn.nextInt();
			soma += numero[i];
			if(maiorNumero < numero[i]) {
				maiorNumero = numero[i];
			}
		}
//		double media = soma / 5;
		
		System.out.println("O maior número digitado foi: " + maiorNumero);
		System.out.println("Sua média foi: " + (double)soma / 5.0);
	}
}
