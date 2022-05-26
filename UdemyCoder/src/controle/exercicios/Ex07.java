package controle.exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, total = 0;
		do {
			System.out.println("Digite valores positivos ou (negativo para sair)");
			num = sc.nextInt();
			if(num >= 0) {
				total += num;
				System.out.printf("Total até o momento: %d\n", total);
			}
		}while(num > 0);

		

		
//		int somadorDeNumeros = 0;
//		int numero = 0;
//		
//		while(numero >= 0) {
//			System.out.println("Digite um numero inteiro(zero ou negativo para sair): ");
//			numero = sc.nextInt();
//			if(numero >= 0) {
//				somadorDeNumeros += numero;
//				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
//			}
//		}
		
		sc.close();
	}

}
