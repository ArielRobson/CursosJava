package fundamentos.Exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celcius: ");
		double temperatura = sc.nextDouble();
		
		double fahrenheit = (temperatura * 9.0 / 5) + 32;
		
		System.out.printf("%.2f ºC convertido para Fahrenheit será %.2f ºF. " ,temperatura, fahrenheit);
		
		sc.close();
	}

}
