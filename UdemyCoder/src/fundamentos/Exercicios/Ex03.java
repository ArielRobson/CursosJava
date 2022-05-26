package fundamentos.Exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, altura);
		
		System.out.printf("Seu IMC é %.2f kg/m2", imc);
		
		sc.close();
	}

}
