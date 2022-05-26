package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
			Thread threadEmail = new Thread(thread1); 
			threadEmail.start();
			
			Thread threadNotaFiscal = new Thread(thread2);
			threadNotaFiscal.start();
				
		  
		  /*Codigo do sistema do usuário continua o fluxo de trabalho*/
		  System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		  /*Fluxo do sistema, cadastro de venda, um emissão de nota fiscal, algo do tipo*/
		  JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando algo rotina, por exemplo envio de e-mail");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo*/
				
			}
			/*Fim do codigo em paralelo*/
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*Código da rotina que eu quero executar em paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo*/
				
			}
			/*Fim do codigo em paralelo*/
			
		}
	};
}
