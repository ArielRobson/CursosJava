package lambdas;

@FunctionalInterface
//A anotação a cima indica que a interface só terá um metodo, se ela vier a ter outro metodo não será possivel
//usa no contexto de lambdas || Salve excessão para metodos do tipo Default e para metodos estaticos conforme exemplo abaixo
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
