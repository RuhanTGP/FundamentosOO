package aula05.metodoconstrutor;

public class PessoaTeste {

	public static void main(String[] args) {
		
		// instancia��o de objetos
		Pessoa pessoa1 = new Pessoa("Jo�o da Silva", 30, 78.5);
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira");
		Pessoa pessoa3 = new Pessoa(18);
		Pessoa pessoa4 = new Pessoa();
		
		// verifica��o dos dados de cada pessoa
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
	}
}
