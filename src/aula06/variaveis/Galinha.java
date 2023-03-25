package aula06.variaveis;

public class Galinha {

	// atributos de instância (específicos)
	String nome;
	int quantidadeOvos;
	
	// atributo de classe (comum entre os objetos)
	static int quantidadeOvosGranja;
	
	public Galinha(String nome) {
		
		this.nome = nome;
		this.quantidadeOvos = 0;
	}
	
	public void botar() {
		
		this.quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
