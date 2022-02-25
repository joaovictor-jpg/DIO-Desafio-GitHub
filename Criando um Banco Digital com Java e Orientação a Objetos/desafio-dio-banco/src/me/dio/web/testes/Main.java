package me.dio.web.testes;

import me.dio.web.models.Banco;
import me.dio.web.models.Cliente;
import me.dio.web.models.ContaCorrente;
import me.dio.web.models.ContaPoupanca;
import me.dio.web.models.SaldoInsuficienteException;

public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Banco banco = new Banco();
		
		cliente.setNome("João Victor");
		cliente.setCpf("189-782-737.77");
		cliente.setProfessao("Instrutor");
		
		cliente2.setNome("Thalita");
		cliente2.setCpf("156-187-865.89");
		cliente2.setProfessao("Vendedora");
		
		ContaCorrente cc = new ContaCorrente(cliente);		
		ContaPoupanca cp = new ContaPoupanca(cliente2);
		
		cc.depositar(100);
		cc.transferencia(50, cp);
		
		cc.imprimeExtrato();
		cp.imprimeExtrato();

		System.out.println(banco.getNome());
		banco.addConta(cc);
		banco.addConta(cp);
		
		banco.listaClientes();
		
		
	}

}
