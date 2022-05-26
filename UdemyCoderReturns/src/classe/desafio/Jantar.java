package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Geysielle",51.3);
		
		Comida comida1 = new Comida("Lasanha", 0.500);
		Comida comida2 = new Comida("Sorvete", 0.200);

		System.out.println(pessoa1.Apresentar());
		//System.out.println(pessoa1.InformandoNomeComida(comida1));
		pessoa1.Comer(comida1);
		System.out.println(pessoa1.Apresentar());
		//System.out.println(pessoa1.InformandoNomeComida(comida2));
		pessoa1.Comer(comida2);
		System.out.println(pessoa1.Apresentar());
	}

}
