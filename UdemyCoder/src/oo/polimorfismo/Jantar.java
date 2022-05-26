package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(95.00);
		
		Arroz ingrediente1 = new Arroz(0.10);
		Feijao ingrediente2 = new Feijao(0.20);
		Comida ingrediente3 = new Arroz(0.3);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.40);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}
}
