package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

@SuppressWarnings("unused")
public class TesteCarro {

	public static void main(String[] args) {
		
		Civic civic = new Civic();//pode usar o tipo principal ou
		
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		
		civic.frear();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);
		
		System.out.println("Ferrari.....................");
		Ferrari ferrari = new Ferrari(400);//o tipo mais generico ex:Carro e depois chama a marca
		
		//ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.ligarTurbo();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		
		
//		ferrari.frear();
//		System.out.println(ferrari);
//		ferrari.frear();
//		System.out.println(ferrari);
//		ferrari.frear();
//		System.out.println(ferrari);
		
	}

}
