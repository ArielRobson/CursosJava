package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Peta");
		lista.add(u1);
		lista.add(new Usuario("Rachel"));
		lista.add(new Usuario("Ava"));
		lista.add(new Usuario("Alexis"));
		lista.add(new Usuario("JessicaNG"));
		
		lista.add(lista.get(3));//Acessa pelo indice
		
		System.out.println(">>>> " + lista.remove(2));
		System.out.println("esse tambem " + lista.remove(new Usuario("Alexis")));
		System.out.println("Tem? " + lista.contains(new Usuario("Peta")));
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
