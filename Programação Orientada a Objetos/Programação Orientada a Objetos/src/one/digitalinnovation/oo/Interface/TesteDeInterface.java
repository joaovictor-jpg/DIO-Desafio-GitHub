package one.digitalinnovation.oo.Interface;

public class TesteDeInterface implements OperacaoMatematica {

	@Override
	public void soma(double operador1, double operador2) {
		// TODO Auto-generated method stub
		System.out.println("Soma: " + (operador1 + operador2));
	}

	@Override
	public void subtracao(double operador1, double operador2) {
		// TODO Auto-generated method stub
		System.out.println("Soma: " + (operador1 - operador2));
	}

	@Override
	public void multiplicacao(double operador1, double operador2) {
		// TODO Auto-generated method stub
		System.out.println("Soma: " + (operador1 * operador2));
	}

	@Override
	public void divisao(double operador1, double operador2) {
		// TODO Auto-generated method stub
		System.out.println("Soma: " + (operador1 / operador2));
	}
}
