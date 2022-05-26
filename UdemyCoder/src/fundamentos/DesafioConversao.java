package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String salario1,salario2,salario3;
		System.out.println("Digite o primeiro salario: ");
		salario1 = sc.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salario: ");
		salario2 = sc.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario: ");
		salario3 = sc.nextLine().replace(",", ".");
		
		double sala1 = Double.parseDouble(salario1);
		double sala2 = Double.parseDouble(salario2);
		double sala3 = Double.parseDouble(salario3);
		
		double resultado = (sala1 + sala2 + sala3) / 3;
		
		System.out.println("A média dos salários será: " + resultado);
		
		
		sc.close();
	}
}
