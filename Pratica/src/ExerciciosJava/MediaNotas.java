package ExerciciosJava;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		double nota1,nota2,nota3,nota4,media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe as 4 notas:");
		System.out.print("Nota 1 = ");
		nota1 = sc.nextDouble();
		System.out.print("Nota 2 = ");
		nota2 = sc.nextDouble();
		System.out.print("Nota 3 = ");
		nota3 = sc.nextDouble();
		System.out.print("Nota 4 = ");
		nota4 = sc.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media > 7) {
			System.out.println("A m�dia final foi " + media  + " e o aluno est� aprovado.");
		} else {
			System.out.println("A m�dia final foi " + media + " e o aluno est� reprovado.");
		}
		sc.close();
	}
}