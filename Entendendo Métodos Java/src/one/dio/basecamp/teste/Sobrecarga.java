package one.dio.basecamp.teste;

import one.dio.basecamp.model.QuadrilateriComRetorno;
import one.dio.basecamp.model.Quadrilatero;

public class Sobrecarga {

	public static void main(String[] args) {
		
		System.out.println("Exerécio quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		
		System.out.println("Exerécio quadrilátero com return");
		System.out.println(QuadrilateriComRetorno.area(3));
		System.out.println(QuadrilateriComRetorno.area(5d, 5d));
		System.out.println(QuadrilateriComRetorno.area(7, 8, 9));
	}
}
