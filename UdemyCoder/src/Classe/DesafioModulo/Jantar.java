package Classe.DesafioModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.200);
		
		Pessoa p1 = new Pessoa("João", 78.0);
		
		System.out.println(p1.Apresentar());
		
		System.out.println("Apos comer arroz....");
		p1.comer(c1);
		System.out.println(p1.Apresentar());
		p1.comer(c2);
		System.out.println("Apos comer Feijão...");
		System.out.println(p1.Apresentar());

	}

}
