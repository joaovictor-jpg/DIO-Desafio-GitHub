package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Notas {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		double nota;

		while (true) {
			System.out.print("Entre com a nota: ");
			nota = scn.nextDouble();
			if (nota < 0 || nota > 10)
				break;
			System.out.println("Sua nota foi: " + nota);
		}
		System.out.println("Fim do Programa...");
	}

}
