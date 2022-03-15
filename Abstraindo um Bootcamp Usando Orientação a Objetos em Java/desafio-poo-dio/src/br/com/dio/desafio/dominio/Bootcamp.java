package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = this.dataInicial.plusDays(45);
	private Set<Dev> dev = new HashSet<>();
	private Set<Conteudo> conteudo = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Dev> getDev() {
		return dev;
	}

	public void setDev(Set<Dev> dev) {
		this.dev = dev;
	}

	public Set<Conteudo> getConteudo() {
		return conteudo;
	}

	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dataFinal, dataInicial, descricao, dev, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(dev, other.dev) && Objects.equals(nome, other.nome);
	}

}
