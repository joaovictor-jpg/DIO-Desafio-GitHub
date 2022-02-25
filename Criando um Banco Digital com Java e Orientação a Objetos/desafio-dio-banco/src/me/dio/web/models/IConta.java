package me.dio.web.models;

public interface IConta {

	void sacar(double valor) throws SaldoInsuficienteException ;

	void depositar(double valor);
	
	void transferencia(double valor, Conta conta) throws SaldoInsuficienteException;
	
	void imprimeExtrato();
}
