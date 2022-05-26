package oo.composicao.desafio;

public class CLienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Joaquim");
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Notebook", 2900.00, 2);
		compra1.adicionarItem("Mouse Gamer", 69.90, 1);
		
		Compra compra2 = new Compra();
		
		compra2.adicionarItem("Impressora", 680.00, 1);
		compra2.adicionarItem("Caderno", 25.90, 3);
		
		
		System.out.println(compra1.obterValor());
		System.out.println(compra2.obterValor());
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
