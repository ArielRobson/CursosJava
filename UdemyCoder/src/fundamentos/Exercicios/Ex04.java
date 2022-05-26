package fundamentos.Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para elevar ao quadrado e ao cubo: ");
		int numero = sc.nextInt();
		
		double resultado = Math.pow(numero, 2);
		double resultado2 = Math.pow(numero, 3);
		
		System.out.println("O numero elevado ao quadrado será: " + resultado);
		System.out.println("O numero elevado ao cubo será: " + resultado2);
		
		sc.close();
	}

}
