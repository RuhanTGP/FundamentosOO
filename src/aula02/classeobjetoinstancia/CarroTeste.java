package aula02.classeobjetoinstancia;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// instanciação de objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		// atribuir valores aos atributos de cada carro
		System.out.println("Informe o modelo do carro 1: ");
		carro1.modelo = input.nextLine();
		
		System.out.println("Informe a marca do carro 1:");
		carro1.marca = input.nextLine();
		
		System.out.println("Informe o ano do carro 1:");
		carro1.ano = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe a placa do carro 1:");
		carro1.placa = input.nextLine();
		
		System.out.println("Informe a cor do carro 1:");
		carro1.cor = input.nextLine();
		
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
		
		// obtenção dos valores dos atributos de cada carro
		// e impressão via console
		System.out.println("CARRO 1");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);
		
		System.out.println("========================");
		System.out.println("CARRO 2");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);
		
		System.out.println("========================");
		System.out.println("CARRO 3");
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Marca: " + carro3.marca);
		System.out.println("Ano: " + carro3.ano);
		System.out.println("Placa: " + carro3.placa);
		System.out.println("Cor: " + carro3.cor);
	}
}
