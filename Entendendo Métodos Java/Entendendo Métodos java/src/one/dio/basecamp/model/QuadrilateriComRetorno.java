package one.dio.basecamp.model;

public class QuadrilateriComRetorno {

	public static double area(double lado) {
		return lado * lado;
	}
	
	public static double area(double lado1, double lado2) {
		return lado1 * lado2;
	}
	
	public static double area(double base, double baseMenor, double altura) {
		return ((base + baseMenor) * altura) / 2;
	}
	
	public static double area(float diagonal1, float diagonal2) {
		return (diagonal1 * diagonal2) / 2;
	}

}
