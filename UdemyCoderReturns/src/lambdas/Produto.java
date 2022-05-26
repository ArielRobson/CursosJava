package lambdas;

public class Produto extends Object{
/*Falando sobre o Object ser a classe Mãe de todas as classes em java, tudo irá surgir apartir dela*/
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal;
	}
	
	/*public void imprimiTeste() {
		double precoFinal = preco * (1 - desconto);
		System.out.printf(nome + " tem preço de R$ %.2f", precoFinal);
	}*/
	
	
}
