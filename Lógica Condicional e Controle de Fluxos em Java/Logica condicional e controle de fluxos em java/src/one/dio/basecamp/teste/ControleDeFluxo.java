package one.dio.basecamp.teste;

import one.dio.basecamp.modelo.DiaDaSemana;
import one.dio.basecamp.modelo.MesDoAno;

public class ControleDeFluxo {

	public static void main(String[] args) {
		int num = 12;
		String diaDaSemana = "Terça";
		int num2 = 10;

		String mes = MesDoAno.mes(num);
		System.out.println("Mês do ano é: " + mes);

		if (mes == "Janeiro" || mes == "Julho" || mes == "Dezembro") {
			System.out.println("Férias");
		}
		
		DiaDaSemana.dia(diaDaSemana);
		
		switch (num2) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("talves");
			break;
		default:
			System.out.println("Valor indefinido");
			break;
		}

	}

}
