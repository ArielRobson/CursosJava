package controle.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um ano para saber se é Bissexto: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto.");
		}else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
			System.out.println("É um ano bissexto");
		}else {
			System.out.println("Não é Bissexto");
		}

		sc.close();
	}

}
