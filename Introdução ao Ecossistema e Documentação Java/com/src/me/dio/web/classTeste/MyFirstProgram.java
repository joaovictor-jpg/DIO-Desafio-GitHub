package me.dio.web.classTeste;

import me.dio.web.modelo.Order;

public class MyFirstProgram {

	public static void main(String[] args) {
		
		Order order = new Order("1234", 99.99);
		
		System.out.println(order);
	}
}
