package one.dio.basecamp.modelo;

public class MesDoAno {

	public static String mes(int num) {
		
		if (num == 1) {
			return "Janeiro";
		} else if (num == 2) {
			return "Fevereiro";
		} else if (num == 3) {
			return "Março";
		} else if (num == 4) {
			return "Abril";
		} else if (num == 5) {
			return "Maio";
		} else if (num == 6) {
			return "Junho";
		} else if (num == 7) {
			return "Julho";
		} else if (num == 8) {
			return "Agosto";
		} else if (num == 9) {
			return "Setembro";
		} else if (num == 10) {
			return "Outubro";
		} else if (num == 11) {
			return "Novembro";
		} else if (num == 12) {
			return "Dezembro";
		} else {
			return "Número inválido";
		}
		
	}
}
