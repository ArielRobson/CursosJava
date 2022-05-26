package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Notebook", 2500, 2);
		compra1.adicionarItem("Smartphone", 1500, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Mouse Gamer", 89.90, 2);
		compra2.adicionarItem("Headset Gamer", 189.90, 3);
		
		Cliente cliente = new Cliente("João");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
