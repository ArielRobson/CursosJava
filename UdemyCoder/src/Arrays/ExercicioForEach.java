package Arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		for(double notasA : notasAlunoA) {
			System.out.println(notasA);
		}
		
		System.out.println("=================================");
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		for(double notasB : notasAlunoB) {
			System.out.println(notasB);
		}
	}
}
