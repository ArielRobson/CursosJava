package ExerciciosJava;

import java.util.Scanner;

public class ImprimindoSoma {

	public static void main(String[] args) {
		int numero1,numero2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.println("Infome o segundo número: ");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		System.out.println("As soma dos dois valores é = " + soma);
		
		sc.close();
	}
}
