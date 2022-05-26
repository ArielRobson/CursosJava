package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra valor: compras) {
		  total += valor.obterValor();
		}
		return total;
	}
}
