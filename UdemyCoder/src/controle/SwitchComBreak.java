package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: 
		case 5:
			conceito = "C";
			break;
		case 4: 
		case 3:
			conceito = "D";
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "Não informado!";
		}
		System.out.println("Conceito é " + conceito);
		
		sc.close();
	}

}
