package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] vetor = new int[20];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100);
		}
		
		for(int veto : vetor) {
			System.out.print("Numero do vetor: ");
			System.out.println(veto);
		}
		System.out.println("\n");
		sucessor(vetor);
	}
	
	public static void sucessor(int[] vetor) {
		
		for(int sucessor : vetor) {
			System.out.println("Sucessor: " + (sucessor + 1));
		}
	}

}
