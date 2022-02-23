package one.digitalinnovation.oo.teste;

import one.digitalinnovation.oo.model.Carro;
import one.digitalinnovation.oo.model.Faxineiro;
import one.digitalinnovation.oo.model.Funcionario;
import one.digitalinnovation.oo.model.Gerente;
import one.digitalinnovation.oo.model.Vendedor;

public class ClasseTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setCor("Azul");
		carro.setModelo("Ferrari 458");
		carro.setCapacidade(2);
		carro.setCapacidadeTanque(86);
		
		double combustivel = carro.totalValorTanque(5.266);
		
		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.getCapacidade());
		System.out.println(carro.getCapacidadeTanque());
		System.out.printf("R$ %.2f\n\n", combustivel);
		
		Carro carro2 = new Carro("Prata", "HeyunDai HB20", 3, 50);
		
		double combustivel2 = carro2.totalValorTanque(5.266);
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidade());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.printf("R$ %.2f\n\n", combustivel2);
		
		/**
		 *--------------------------------------------------------------------------------
		 */
		 
		Funcionario funcionario = new Gerente("João Victor", "Madeira da Silva", 21);
		Funcionario funcionario2 = new Vendedor("Thalita", "Madeira da Silva", 18);
		Funcionario funcionario3 = new Faxineiro("Julia", "Madeira da Silva", 16);
		
		System.err.println("Upacasts:");
		System.out.println(funcionario);
		System.out.println(funcionario2);
		System.out.println(funcionario3);
		
		Gerente gerente = (Gerente)funcionario;
		Vendedor vendedor = (Vendedor)funcionario2;
		Faxineiro faxineiro = (Faxineiro)funcionario3;
		
		System.out.println("\nDowncasts:");
		System.out.println(gerente);
		System.out.println(vendedor);
		System.out.println(faxineiro);
	}

}
