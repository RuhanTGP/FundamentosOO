package aula01.entradadados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		String nome;
		String estadoCivil;
		int idade;
		double peso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		nome = input.nextLine();
		
		System.out.println("Informe sua idade:");
		idade = input.nextInt();
		
		System.out.println("Informe seu peso:");
		peso = input.nextDouble();
		
		// limpeza de buffer
		input.nextLine();
		
		System.out.println("Informe seu estado civil:");
		estadoCivil = input.nextLine();
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.println("Estado Civil: " + estadoCivil);
		
		input.close();
	}
}
