import java.util.Scanner;

public class Pratica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomesAleatorios[];
		nomesAleatorios = new String[5];
		
		int x;
		for(x = 0; x < nomesAleatorios.length; x++) {
			System.out.println("digite um valor qualquer");
			nomesAleatorios[x] = sc.nextLine();
		}
		System.out.println(nomesAleatorios[0]);
		System.out.println(nomesAleatorios[1]);
		System.out.println(nomesAleatorios[2]);
		System.out.println(nomesAleatorios[3]);
		System.out.println(nomesAleatorios[4]);
		
		System.out.println("================================");
		
		for(String nomes: nomesAleatorios) {
			System.out.println(nomes.replace("a","@"));
			
		}
		sc.close();
	}
}
