package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = gerador.nextInt(9);
			}
		}
		
//		for(int i = 0; i < matriz.length; i++) {
//			for(int j = 0; j < matriz.length; j++) {
//				System.out.println(matriz[i][j]);
//			}
//		}
		
		System.out.print("Matriz: ");
        for (int[] linha : matriz  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
	}

}
