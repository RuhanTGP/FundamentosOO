package aula04.metodos;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// instancia��o de objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// atribuir valores aos atributos de cada carro
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2020;
		carro1.placa = "ABC-1234";
		carro1.cor = "Amarelo";

		carro2.modelo = "Onix";
		carro2.marca = "Chevrolet";
		carro2.ano = 2015;
		carro2.placa = "MNO-9876";
		carro2.cor = "Preto";

		carro3.modelo = "Ka";
		carro3.marca = "Ford";
		carro3.ano = 2010;
		carro3.placa = "XYZ-1596";
		carro3.cor = "Branco";

		// obten��o dos valores dos atributos de cada carro
		// e impress�o via console
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);

		carro3.ligar();
		carro3.ligar();
		carro3.acelerar();
		carro1.ligar();
	}
}
