package controle.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite duas notas para saber a média:");
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		double resultado = (nota1 + nota2) / 2;
		System.out.println("A sua média foi " + resultado + " e você está: ");
		if(resultado >= 7.0) {
			System.out.println("Aprovado");
		}else if(resultado < 7.0 && resultado > 4.0) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
