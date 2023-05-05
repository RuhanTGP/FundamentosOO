package aula08.encapsulamentodados;

public class ContaBancaria {

	private int numero;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numero, String nomeTitular) {

		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso.");

		this.calcularRendimentos();
	}

	public void imprimirSaldo() {

		System.out.println("======== SALDO ========");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
		System.out.println("=======================");
	}

	private void calcularRendimentos() {

		this.saldo *= 1.10;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if (!nomeTitular.equals("")) {

			this.nomeTitular = nomeTitular;
		}
	}

	public int getNumero() {
		return numero;
	}
}
