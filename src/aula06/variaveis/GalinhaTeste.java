package aula06.variaveis;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha("Giselda");
		Galinha galinha2 = new Galinha("Matilde");
		Galinha galinha3 = new Galinha("Clotilde");
		
		galinha1.botar();
		galinha1.botar();
		galinha1.botar();
		
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		
		galinha3.botar();
		
		System.out.println(galinha1.nome + ": " + galinha1.quantidadeOvos);
		System.out.println(galinha2.nome + ": " + galinha2.quantidadeOvos);
		System.out.println(galinha3.nome + ": " + galinha3.quantidadeOvos);
		System.out.println("TOTAL: " + Galinha.quantidadeOvosGranja);
	}
}
