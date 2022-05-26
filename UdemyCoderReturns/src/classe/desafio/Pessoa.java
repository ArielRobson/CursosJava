package classe.desafio;

public class Pessoa {

	double peso;
	String nome;
	
	Pessoa(String nome, double peso){
		this.peso = peso;
		this.nome = nome;
	}
	
	void Comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;			
		}
	}
	
	String Apresentar() {
		return "Olá meu nome é " + this.nome + " e tenho " + this.peso + " Kg";
	}
	
	String InformandoNomeComida(Comida comida) {
		return "Agora irei comer " + comida.nome;
	}
}
