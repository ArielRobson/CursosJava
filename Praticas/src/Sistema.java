public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItens("Notebook",2500.00, 2);
		compra1.adicionarItens("Mouse Gamer",500.00, 1);
		compra1.adicionarItens("HeadSet Gamer",350, 1);
		compra1.adicionarItens("Monitor 24P",1220.00, 2);
		
		Cliente cliente1 = new Cliente("Rachel Star");
		
		cliente1.adicionarCompra(compra1);
		
		System.out.println(cliente1.ObterValorTotal());
		
		compra1.teste();
		

	}
}
