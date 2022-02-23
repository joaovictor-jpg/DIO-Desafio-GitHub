package one.digitalinnovation.oo.model;

public class Carro extends Veiculo {

	private String cor;
	private String modelo;
	private int capacidade;
	private int capacidadeTanque;
	
	public Carro(){}
	
	public Carro(String cor, String modelo, int capacidade, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacdade) {
		this.capacidade = capacdade;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public double totalValorTanque(double valorCombustivel) {
		return this.capacidadeTanque * valorCombustivel;
	}
}
