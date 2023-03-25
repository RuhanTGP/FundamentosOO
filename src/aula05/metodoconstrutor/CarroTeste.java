package aula05.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, "ABC-1234", "Amarelo");
		Carro carro2 = new Carro("Onix", "Chevrolet", 2015, "MNO-9876", "Preto");

		System.out.println(carro1);
		System.out.println(carro2);
	}
}
