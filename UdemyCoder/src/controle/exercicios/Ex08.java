package controle.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
			
		}
		
//		char letras[] = palavra.toCharArray();
//		
//		for(int i = 0; i < letras.length; i++) {
//			System.out.println(letras[i]);
//		}

		sc.close();

	}

}
