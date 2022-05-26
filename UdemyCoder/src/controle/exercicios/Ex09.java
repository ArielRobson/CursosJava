package controle.exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resultado = 0;
		
		System.out.println("Digite 10 valores para saber qual o maior: ");
		for(int i = 0; i < 10; i++) {
			System.out.print("Valor: " + (i+1) + " :");
			int numeros = sc.nextInt();
			if(numeros > resultado) {
				resultado = numeros;
				
			}
		}
		
			System.out.println("O maior número digitado foi: " + resultado);
		
		
		
		
		
		sc.close();

	}

}
