package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana : ");
		String dia = sc.nextLine();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if("terca".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if("sabado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("Dia Inválido. ");
		}
		
		sc.close();
	}

}
