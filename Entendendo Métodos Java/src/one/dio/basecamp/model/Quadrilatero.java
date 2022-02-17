package one.dio.basecamp.model;

public class Quadrilatero {

	public static void area(double lado) {
		System.out.println("Área do quadrado: " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("Área do retângulo: " + lado1 * lado2);
	}
	
	public static void area(double base, double baseMenor, double altura) {
		System.out.println("Área do trápezio: " + ((base + baseMenor) * altura) / 2);
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
	}
}
