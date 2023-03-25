package aula05.metodoconstrutor;

public class Pessoa {

	String nome;
	int idade;
	double peso;

	public Pessoa(String nome, int idade, double peso) {

		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public Pessoa() {
		this("Rafael", 15, 50.0);
	}

	public Pessoa(String nome) {
		this(nome, 15, 50.0);
	}

	public Pessoa(int idade) {
		this("Rafael", idade, 50.0);
	}

	public void falar() {

		System.out.println(nome + " está falando.");
	}

	public void correr() {

		System.out.println(nome + " está correndo.");
	}

	public void dormir() {

		System.out.println(nome + " está dormindo.");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
}
