package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int primeiraParte = 6 * (3 + 2);
		int primeiraParte2 = 3 * 2;
		int resultadoPParte =(int) Math.pow(primeiraParte, 2) / primeiraParte2;
		
		int segundaParte = (1-5) * (2-7);
		int segundaParte2 = 2;
		int segundaParte3 = segundaParte / segundaParte2;
		int resultadoSParte = (int) Math.pow(segundaParte3, 2);
		
		int resultadoGeral = resultadoPParte - resultadoSParte;
		int resultadoGeral2 = (int) Math.pow(resultadoGeral, 3) / (int) Math.pow(10, 3);
		
		System.out.println("O resultado é " + resultadoGeral2);
	}
}

/*
	double numA = Math.pow(6*(3+2),2);
	double denA = 3 * 2;

	double numB = (1 - 5) * (2 - 7);
	double denB = 2;

	double superiorA = numA / denA;
	double superiorB = Math.pow(numB / denB, 2);

	double superior = Math.pow(SuperiorA - superiorB,3);
	double inferior = Math.pow(10,3);
	
	double resultado = superior / inferior;

	System.out.println("O resultado é " + resultado);

*/