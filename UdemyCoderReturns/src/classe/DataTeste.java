package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data(05,9,2014);
		//data1.dia = 05;
		//data1.mes = 9;
		//data1.ano = 2014;

		Data data2 = new Data();
		//data2.dia = 16;
		//data2.mes = 04;
		//data2.ano = 2017;
		
		//System.out.println("A primeira data é " + data1.dia + "/" + data1.mes + "/" + data1.ano);
		//System.out.printf("%d/%d/%d\n", data1.dia,data1.mes,data1.ano);//exemplo professor.
		//System.out.println("A segunda data é " + data2.dia + "/" + data2.mes + "/" + data2.ano);
		System.out.println(data1.obterDataFormada());
		System.out.println(data2.obterDataFormada());
	}

}
