package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = { -5, -6, 15, 8, 4 };

		String numero = "";
		for (int i = vetor.length - 1; i >= 0; i--) {
			numero = numero + vetor[i] + "\n";
		}

		System.out.println(numero);

//		int[] vetor = { -5, -6, 15, 50, 8, 4 };
//
//		// System.out.println(vetor.length);
//
//		System.out.print("Vetor: ");
//		int count = 0;
//		while (count < (vetor.length)) {
//			System.out.print(vetor[count] + " ");
//			count++;
//		}
//
//		System.out.print("\nVetor: ");
//		for (int i = (vetor.length - 1); i >= 0; i--) {
//			System.out.print(vetor[i] + " ");
//		}
	}

}
