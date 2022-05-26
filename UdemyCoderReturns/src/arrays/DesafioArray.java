package arrays;


import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do Array");
		int tamanhoArray = sc.nextInt();
		
		double[] notasAluno = new double[tamanhoArray];
		
		for(int i = 0; i < notasAluno.length; i++) {
			System.out.println("Informe a nota " + (i + 1 + ":"));
			notasAluno[i] = sc.nextDouble();;
		}
		
		double soma = 0;
		for(double nota: notasAluno) {
			soma += nota;
		}
		double media = soma / notasAluno.length;
		System.out.println("A média é " + media + "!");

		sc.close();
	}

}
