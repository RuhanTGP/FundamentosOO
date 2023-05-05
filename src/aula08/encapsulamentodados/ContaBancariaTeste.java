package aula08.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(111, "João da Silva");
		conta1.imprimirSaldo();

		conta1.setNomeTitular("");

		System.out.println(conta1.getNumero());
		System.out.println(conta1.getNomeTitular());
	}
}
