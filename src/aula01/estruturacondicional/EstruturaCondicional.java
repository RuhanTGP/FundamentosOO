package aula01.estruturacondicional;

public class EstruturaCondicional {

	public static void main(String[] args) {
		int valor = 11;

		String verific = (valor == 10) ? "sim, � 10" : "n�o, n�o � 10";

		System.out.println(verific);

		double notaFinal = 3.5;

		if (notaFinal >= 6.0) {
			System.out.println("aprovado");
		} else {
			if (notaFinal >= 4.0) {
				System.out.println("recupera��o");
			} else {
				System.out.println("reprovado");
			}
		}
	}
}
