package aula11.vetor.exercicio02;

import java.util.Iterator;
import java.util.Scanner;

public class Aluno {

	private int registroAcademido;
	private String nome;
	private double[] notas;

	private Scanner input;

	public Aluno(int numeroTotalNotas) {

		this.notas = new double[numeroTotalNotas];
		this.input = new Scanner(System.in);
	}

	public void receberNotas() {

		System.out.print("Informe seu nome: ");
		this.nome = this.input.nextLine();

		System.out.print("Informe seu registro acadêmico: ");
		this.registroAcademido = this.input.nextInt();

		for (int i = 0; i < this.notas.length; i++) {

			System.out.print("Informe a nota " + (i + 1) + ": ");
			this.notas[i] = this.input.nextDouble();
		}
	}

	public double calcularMedia() {

		double soma = 0.0;

		for (int i = 0; i < this.notas.length; i++) {

			soma += this.notas[i];
		}

		return soma / this.notas.length;
	}

	public void exibirNotas() {

		System.out.println("Registro Acadêmico: " + this.registroAcademido);
		System.out.println("Nome: " + this.nome);

		for (int i = 0; i < this.notas.length; i++) {

			System.out.println("Nota " + (i + 1) + ": " + this.notas[i]);
		}
	}
}
