package ExerciciosJava;

import java.util.Scanner;

public class MetroPCentimetros {

	public static void main(String[] args) {
		int metros, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor em metros: ");
		metros = sc.nextInt();
		
		resultado = metros * 100;
		System.out.println(metros + " metros Corrensponde a " + resultado + " centimetros.");
		
		sc.close();
	}
}
