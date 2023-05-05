package aula10.enumaracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(100, "28/04/2023");
		pedido1.imprimirDados();

		pedido1.alterarStatus(Status.PROCESSANDO);
		pedido1.imprimirDados();
	}
}
