package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		System.out.println(d1.obterDataFormatada());
		
		var d2 = new Data(31, 07, 2045);
		
		System.out.println(d2.obterDataFormatadaCorrecao());

	}

}
