package ExerciciosJava;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a altura do quadrado: ");
		double quadrado = sc.nextDouble();
		
		double resultado = quadrado * quadrado;
		
		System.out.println("A �rea do quadrado �: " + resultado + " m�");

		sc.close();
	}
}
