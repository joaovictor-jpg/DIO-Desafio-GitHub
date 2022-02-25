package me.dio.web.models;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	@Override
	public void transferencia(double valor, Conta conta) throws SaldoInsuficienteException {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s, Agencia: %d, Número: %d, Saldo: %.2f", this.cliente.getNome(), this.getAgencia(), this.getNumero(), this.getSaldo()));
	}
}
