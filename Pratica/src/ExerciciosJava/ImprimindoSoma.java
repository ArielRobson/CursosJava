package ExerciciosJava;

import java.util.Scanner;

public class ImprimindoSoma {

	public static void main(String[] args) {
		int numero1,numero2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o primeiro n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Infome o segundo n�mero: ");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		System.out.println("As soma dos dois valores � = " + soma);
		
		sc.close();
	}
}
