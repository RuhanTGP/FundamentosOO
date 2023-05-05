package aula09.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("João", "01/02/2000", "Masculino", "joao@email.com", "Solteiro", endereco1);
		pessoa1.imprimirDados();
		
		Pessoa pessoa2 = new Pessoa("Maria", "10/12/2005", "Feminino", "maria@email.com", "Casada", "Monteiro Lobado", 2048, "Jd. Carvalho", "Ponta Grossa", "PR");
		pessoa2.imprimirDados();
	}
}








