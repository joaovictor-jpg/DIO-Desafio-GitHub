package me.dio.web.models;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimirInformacoesComuns();
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorSacar  = valor +  6.50;
		super.sacar(valorSacar);
	}

}
