package fundamentos.Exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em Fahrenheit para saber em Celsius: ");
		double temperatura = sc.nextDouble();
		
		double celcius = (temperatura - 32) * 5.0 / 9.0;
		
		System.out.printf("%.2f ºF convertido é %.2f ºC",temperatura, celcius);

		sc.close();
	}

}
