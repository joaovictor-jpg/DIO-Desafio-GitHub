package one.dio.basecamp.teste;

public class CriacaoDeMetodos {

	public static void main(String[] args) {

		System.out.println(opecaoBasica(10, 2));
		System.out.println(situacaoDoDia(1));
		double total = emprestimo(1000, 3);
		System.out.println(total);
	}

	public static String opecaoBasica(int vl1, int vl2) {

		double r1 = vl1 + vl2;
		double r2 = vl1 - vl2;
		double r3 = vl1 * vl2;
		double r4 = vl1 / vl2;

		return "soma: " + vl1 + " + " + vl2 + " = " + r1 + "| Subtração: " + vl1 + " - " + vl2 + " = " + r2
				+ "| Multiplicação: " + vl1 + " * " + vl2 + " = " + r3 + "| Divição: " + vl1 + " / " + vl2 + " = " + r4;
	}

	public static String situacaoDoDia(int hora) {
		if (hora < 12) {
			return "Bom dia!";
		}
		if (hora >= 12 && hora < 18) {
			return "Boa tarde!";
		}
		return "Boa noite";
	}

	public static double emprestimo (double valorDoEmpresttimo, int parcelas) {
		if(parcelas == 2) {
			return valorDoEmpresttimo + (valorDoEmpresttimo * 0.06);
		} else if(parcelas == 3) {
			return valorDoEmpresttimo + (valorDoEmpresttimo * 0.45);
		} else if {
			return valorDoEmpresttimo + (valorDoEmpresttimo * 0.50);
		}
		return valorDoEmpresttimo;
	}
}
