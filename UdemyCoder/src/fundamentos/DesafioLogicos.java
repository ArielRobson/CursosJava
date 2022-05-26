package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comproTV50 = trabalho1 && trabalho2;
		boolean comproTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?" + comproTV50);
		System.out.println("comprou TV 32\"?" + comproTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
		
	}
}


//se os dois trabalhos der certo compra tv 50 e toma sorvete
// se só um der certo compra Tv 32 polegas e toma sorvete