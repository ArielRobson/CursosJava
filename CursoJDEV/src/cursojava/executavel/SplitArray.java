package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Maria ,curso java ,80 ,90 ,80 ,89";
		
		String[] valoresArray = texto.split(",");
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println(valoresArray[i]);
		}
		
		System.out.println("-----------------------------------------");
		/*Convertendo um Array em uma lista*/
		List<String> list = Arrays.asList(valoresArray);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("------------------------------------------");
		/*Convertendo uma lista para Array*/
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
		
		
		
		
		
		
		
		
		
	}
}
