package ExerciciosJava;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero = sc.nextInt();
		
		System.out.println("O número informado foi [ " + numero +" ].");
		
		sc.close();
	}
}
