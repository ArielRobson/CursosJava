package Lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar(); // polimorfismo
		System.out.println(calculo.executar(2, 3));
	}
}
