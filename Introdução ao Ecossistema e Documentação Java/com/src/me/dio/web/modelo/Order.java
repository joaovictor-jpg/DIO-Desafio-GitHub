package me.dio.web.modelo;

/**
 * Representa um pedido
 * Data: 11 Fevereiro 2022
 * 
 * @author João victor
 *@version 1.0.0
 *@since 1.0.0
 */
public class Order {

	private final String code;
	private final double totalValue;
	private String[] items;
	
	/**
	 * Construtor da classe
	 * 
	 * @param code      	Código do pedido
	 * @param totalvalue	Valor total do pedido
	 */
	public Order(String code, double totalvalue) {
		this.code = code;
		this.totalValue = totalvalue;
	}
	
	/**
	 * Calcula as taxas de acordo com valor total do pedido. Se o pedido for maior que R$100,00 ou R$200,00 uma taxa é cobrada
	 * 
	 * @return valor total do pedido com as taxas.
	 */
	public Double calculeiteFee() {
		if(this.totalValue >= 100) {
			return this.totalValue * 0.99;
		}else if(this.totalValue >= 200) {
			return this.totalValue * 1.99;
		}else {
			return this.totalValue;
		}
	}
	
	public void printItems() {
		for (String i : items) {
			System.out.println(i);
		}
	}
	
	@Override
	public String toString() {
		return "Order={" + "code='" + this.code + "', " + "TotalValue= " + this.totalValue + "}";
	}
}
