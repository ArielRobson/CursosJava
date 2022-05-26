package lambdas;

@FunctionalInterface
//A anota��o a cima indica que a interface s� ter� um metodo, se ela vier a ter outro metodo n�o ser� possivel
//usa no contexto de lambdas || Salve excess�o para metodos do tipo Default e para metodos estaticos conforme exemplo abaixo
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
