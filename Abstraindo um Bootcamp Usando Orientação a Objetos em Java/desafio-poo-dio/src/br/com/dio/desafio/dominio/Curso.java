package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargahoraria;
	
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * this.getCargahoraria();
	}
	
	@Override
	public String toString() {
		return "Mentoria [Título = " + this.getTitulo() +" Descrição = " + this.getDescricao() + " Carga = " + this.cargahoraria + "]";
	}
	
}
