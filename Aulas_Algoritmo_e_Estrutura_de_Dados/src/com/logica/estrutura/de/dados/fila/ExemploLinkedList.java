package com.logica.estrutura.de.dados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList<String>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Rafael");
		filaBanco.add("Thiago");
		filaBanco.add("Cristiana");
		filaBanco.add("Julia");
		filaBanco.add("Matheus");
		filaBanco.add("Adriana");
		filaBanco.add("Henrique");
		
		System.out.println(filaBanco);
		
		String clienteASertendido = filaBanco.poll();
		System.out.println("PRIMEIRO A SER ATENDIDO" + " --> " + clienteASertendido);
		
		System.out.println(filaBanco);
		
		
		String primeiroCliente = filaBanco.poll();
		System.out.println("PRIMEIRO A SER ATENDIDO" + " --> " + primeiroCliente);
		
		System.out.println(filaBanco);
	}

}
