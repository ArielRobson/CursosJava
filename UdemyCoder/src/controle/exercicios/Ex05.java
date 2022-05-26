package controle.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber se é primo: ");
		int num = sc.nextInt();
		int contadorDeDivisores = 0;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDeDivisores++;
			}

	}
		
		switch (contadorDeDivisores) {
		
		case 0:
			System.out.println("\nO numero " + num + " é primo.");
			break;
			
		default:
			System.out.println("\nO numero " + num + " não é primo");
		
		}
		sc.close();

	}

}
