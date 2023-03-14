package aula01.estruturacondicional;

public class EstruturaCondicional {

	public static void main(String[] args) {
		int valor = 11;

		String verific = (valor == 10) ? "sim, é 10" : "não, não é 10";

		System.out.println(verific);

		double notaFinal = 3.5;

		if (notaFinal >= 6.0) {
			System.out.println("aprovado");
		} else {
			if (notaFinal >= 4.0) {
				System.out.println("recuperação");
			} else {
				System.out.println("reprovado");
			}
		}
	}
}
