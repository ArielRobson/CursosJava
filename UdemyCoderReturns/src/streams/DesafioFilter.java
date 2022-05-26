package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		ProdutosDF p1 = new ProdutosDF("Geladeira", 3699.96, false);
		ProdutosDF p2 = new ProdutosDF("Notebook", 4360.99, true);
		ProdutosDF p3 = new ProdutosDF("Smartphone", 1700.90, true);
		ProdutosDF p4 = new ProdutosDF("Liquidificador", 99.96, false);
		ProdutosDF p5 = new ProdutosDF("Fogão", 699.96, false);
		ProdutosDF p6 = new ProdutosDF("SmartTV", 1699.96, true);
		
		List<ProdutosDF> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<ProdutosDF> Caro = p -> p.preco >= 1500;
		Predicate<ProdutosDF> isTecnologia = p -> p.freteGratis;
		Function<ProdutosDF, String> informacao = p -> "O produto " + p.nome + " Custa R$ " + p.preco + " e tem frete grátis !!!";
		
		produtos.stream()
			.filter(Caro)
			.filter(isTecnologia)
			.map(informacao)
			.forEach(System.out::println);
			
		
	}
}
