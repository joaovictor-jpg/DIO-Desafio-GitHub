package me.dio.web.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static final String NOME_PADRA = "BigBank";

	private String nome;
	
	private List<Conta> conta;
	
	public Banco () {
		this.nome = NOME_PADRA;
		this.conta = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}
	
	public void addConta(Conta conta) {
		this.conta.add(conta);
	}
	
	public void listaClientes() {
		System.out.println("\n");
		for (Conta conta2 : conta) {
			System.out.println(String.format("Nome: %s, CPF: %s, Profissao: %s", conta2.getCliente().getNome(), conta2.getCliente().getCpf(), conta2.getCliente().getProfessao()));
		}
	}
}
