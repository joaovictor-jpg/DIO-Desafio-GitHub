package one.dio.basecamp.teste;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		
		double salarioMensal = 11893.58d;
		double mediaSalarial = 10500d;
		
		int quantidadeDependente = 4;
		int mediaDependente = 2;
		
		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidadeDependente >= mediaDependente;
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b2 || b3);
		System.out.println(b2 || b4);
		System.out.println(b1 ^ b3);
		System.out.println(b4 ^ b1);
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println((i1 > i2) || (f2 < f1));
		System.out.println(((i1 + i2) < (f2 - f1)) && true);
		System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependente >= mediaDependente));
		System.out.println((salarioBaixo) && (muitosDependentes));
		System.out.println(recebeAuxilio);
	}
}
