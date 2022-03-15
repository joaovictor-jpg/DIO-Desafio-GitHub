package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	@Override
	public String toString() {
		return "Mentoria [T�tulo = " + this.getTitulo() +" Descri��o = " + this.getDescricao() + " data = " + this.data + "]";
	}
	
	
	
}
