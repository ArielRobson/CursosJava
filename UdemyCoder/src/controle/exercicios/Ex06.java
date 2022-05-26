package controle.exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int aleatorio = 56;
		
		for(int i = 9; i > 0; i--) {
			System.out.println("Jogo da advinhação.");
			System.out.print("Chute um numero e tente advinhar: ");
			int tentativa = sc.nextInt();
			if(tentativa < aleatorio) {
				System.out.println("Tentativa menor que o numero.");
			}else if(tentativa > aleatorio){
				System.out.println("Tentativa maior que o numero.");
			}else if(tentativa == aleatorio) {
				System.out.println("Você acertou!!!, Parabéns!!!");
				break;
			}
			System.out.println("Numero de tentativas restantes = " + (i));
			System.out.println("====================||=====================");
		}

		sc.close();
	}

}
