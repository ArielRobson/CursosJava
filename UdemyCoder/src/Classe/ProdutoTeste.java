package Classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrilho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = RS%.2f.", mediaCarrilho);
		
		
		
		
		sc.close();

	}

}
