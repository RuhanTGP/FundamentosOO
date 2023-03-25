package aula05.metodoconstrutor;

public class Carro {

	// atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;

	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	}

	// métodos da classe
	public void ligar() {

		if (!ligado) {
			
			ligado = true;
			System.out.println(marca + " " + modelo + " ligou.");
		
		} else {
			
			System.out.println(marca + " " + modelo + " já encontra-se ligado");
		}
	}

	public void desligar() {

		if (ligado && velocidade == 0) {
		
			ligado = false;
			System.out.println(marca + " " + modelo + " desligou.");
		
		} else {
		
			System.out.println("Não foi possível desligar o " + marca + " " + modelo);
		}
	}

	public void acelerar() {

		if (ligado) {

			velocidade += 10;

			if (velocidade > 200) {

				System.out.println(marca + " " + modelo + " atingiu a velocidade máxima.");
				velocidade = 200;
			}

		} else {
			System.out.println(marca + " " + modelo + " não encontra-se ligado.");
		}
	}

	public void frear() {

		if (ligado) {

			velocidade -= 10;

			if (velocidade < 0) {

				velocidade = 0;
				System.out.println(marca + " " + modelo + " encontra-se parado.");
			}

		} else {

			System.out.println(marca + " " + modelo + " não encontra-se ligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
}
