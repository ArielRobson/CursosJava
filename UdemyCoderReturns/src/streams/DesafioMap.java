package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = e -> new StringBuilder(e).reverse().toString();
		Function<String, Integer> binarioParaInt = e -> Integer.parseInt(e, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
		
		/*1. N�mero para string bin�ria...6 => "110"
		 *2. Inverter a String..."110" => "011"
		 *3. Converter de volta para inteiro => "011" => 3*/
	}
}
