package me.dio.web.models;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("=== Extrato da Conta Poupança ===");
		super.imprimirInformacoesComuns();
	}

}
