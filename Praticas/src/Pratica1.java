
public class Pratica1 {

	public static void main(String[] args) {
		
		int x = 10;
		double y = 11564545454D;
		float y1 = 12;
		long g = 59658746956L;
		String l = "eita ";
		char ch = 'x';
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(y1);
		System.out.println(g);
		System.out.println(l);
		System.out.println(ch);
		
		while(x >= 0) {
			System.out.println("O valor de x é " + x);
			
			x--;
		}
		System.out.println("============================================");
		
		for(int x1 = 0; x1 <= 10; x1++) {
			System.out.println("O valor de x é " + x1);
		}
		
		String t1 = "     OLá Guys";
		String t2 = "   Olá World     ";
		System.out.println(t1);
		System.out.println(t1.trim());
		System.out.println(t2.indexOf("W"));
		System.out.println(t2.toUpperCase());
		System.out.println(t2.toLowerCase());
		System.out.println(t2.strip());
		System.out.println(t2.trim());
	}

}
