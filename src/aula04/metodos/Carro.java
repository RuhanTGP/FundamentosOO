package aula04.metodos;

public class Carro {

	// atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	// métodos da classe
	public void ligar() {
		System.out.println(marca + " " + modelo + " ligou.");
	}

	public void desligar() {
		System.out.println(marca + " " + modelo + " desligou.");
	}

	public void acelerar() {
		System.out.println(marca + " " + modelo + " acelerou.");
	}

	public void frear() {
		System.out.println(marca + " " + modelo + " freou.");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
