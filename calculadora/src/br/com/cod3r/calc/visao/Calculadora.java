package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);//define o tamanho da tela, altura e largura
		setDefaultCloseOperation(EXIT_ON_CLOSE);//mata o processo ao fechar a janela
		setLocationRelativeTo(null);//faz a tela iniciar no meio
		setVisible(true);//faz aparecer um tela pequena
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());//configura a tela em norte,sul,leste,oeste
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));//configura o tamanho do north
		add(display, BorderLayout.NORTH);
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
