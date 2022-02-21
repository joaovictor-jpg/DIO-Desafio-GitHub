package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int numeroDaTabuada = scn.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(numeroDaTabuada + " X " + i + " = " + (numeroDaTabuada * i));
		}
	}

}
