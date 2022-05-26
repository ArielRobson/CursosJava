package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elemento na fila
		//Diferença é o comportamento quando a fila está cheia!
		fila.add("Peta");
		fila.offer("Ava");
		fila.add("Rachel");
		fila.offer("Sabrina");
		fila.add("Bianca");
		fila.offer("Bruna");
		
		System.out.println(fila.peek());// retorna null se estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());//retorna exceção se estiver vazia
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		System.out.println(fila.contains("Sabrina"));
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());// retorna null se estiver vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());//retorna exceção se estiver vazia
	}
}
