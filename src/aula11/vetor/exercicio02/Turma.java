package aula11.vetor.exercicio02;

import java.util.Scanner;

public class Turma {

	private Aluno[] alunos;

	public Turma() {

		this.alunos = new Aluno[4];
	}

	public void entrarDadosAluno() {

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < this.alunos.length; i++) {

			System.out.println("Informe a quantidade de notas para o aluno " + (i + 1));
			int numeroNotas = input.nextInt();

			Aluno aluno = new Aluno(numeroNotas);
			this.alunos[i] = aluno;

			this.alunos[i].receberNotas();
		}
	}

	public void exibirDadosTurma() {

		double mediaTurma = 0.0;

		for (int i = 0; i < this.alunos.length; i++) {

			this.alunos[i].exibirNotas();
			System.out.println("Média do Aluno: " + this.alunos[i].calcularMedia());

			mediaTurma += this.alunos[i].calcularMedia();
		}

		System.out.println("Média da Turma: " + (mediaTurma / this.alunos.length));
	}
}
