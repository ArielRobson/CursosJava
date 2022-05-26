import java.util.ArrayList;
import java.util.List;

public class Compra {

	Item item;
	List<Item> itens = new ArrayList<>();
	
	void adicionarItens(String nome, double preco, int quantidade) {
		var Produto = new Produto(nome, preco);
		this.itens.add(new Item(Produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item coisas: itens) {
			total += coisas.quantidade * coisas.produto.preco;
		}
		
		return total;
	}
	void teste() {
		System.out.println();
		for(Item i: itens) {
			System.out.println(i.produto.nome + " " + i.produto.preco +" R$" + " ==> " + i.quantidade);
		}
	}
}

