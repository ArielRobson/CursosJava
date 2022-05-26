package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "João Pedro";
		compra.adcionarItem("Caneta", 20, 7.45);
		compra.adcionarItem(new Item("Borracha", 12, 3.89));
		compra.adcionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra.itens.size());
		System.out.println(compra.obterValorTotal());
		
		//double total = compra.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		
		//System.out.println("O total é " + total);
	}
}
