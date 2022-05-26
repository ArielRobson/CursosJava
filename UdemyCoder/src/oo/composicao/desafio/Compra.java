package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	
	double obterValor() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
