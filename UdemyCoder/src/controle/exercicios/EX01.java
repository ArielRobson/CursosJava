package controle.exercicios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 10 && num % 2 == 0) {
			System.out.println("É Par e está entre 0 e 10.");
		}else if(num >= 0 && num <= 10 && num % 2 == 1) {
			System.out.println("Não é Par, mas está entre 0 e 10.");
		}else {
			System.out.println("Não é Par e não está entre 0 e 10");
		}

		sc.close();

	}

}
