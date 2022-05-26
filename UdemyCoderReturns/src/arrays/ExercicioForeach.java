package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
		double[] notas1 = {7.5, 9.6, 6.3, 7.4};
		
		System.out.println(Arrays.toString(notas1));

		for(double resultado: notas1) {
			System.out.print(" " + resultado + " ");
		}
	}

}
