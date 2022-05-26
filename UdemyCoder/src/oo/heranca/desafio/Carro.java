package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima; 
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getDelta();			
		}
	}
	
	public void frear() {
		if(velocidadeAtual == 0) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= 5;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + " Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
