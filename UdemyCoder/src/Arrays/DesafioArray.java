package Arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de notas: ");
		int notas = sc.nextInt();
		
		double[] notasAlunos = new double[notas];
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + " : ");
			notasAlunos[i] = sc.nextDouble();
		}
		double total = 0;
		for(double nota : notasAlunos) {
			total += nota;
		}
		
		double resultado = total / notasAlunos.length;
		System.out.printf("A média das notas é : %.2f", resultado );

		sc.close();

	}

}
