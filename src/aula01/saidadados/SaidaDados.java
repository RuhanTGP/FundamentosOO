package aula01.saidadados;

public class SaidaDados {

	public static void main(String[] args) {
		
		String nome = "João da Silva";
		int idade = 30;
		double peso = 88.5;
		
		System.out.println("println");
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		
		System.out.println("printf");
		System.out.printf("%s possui %d anos e %.3f kg.", nome, idade, peso);
	}
}
