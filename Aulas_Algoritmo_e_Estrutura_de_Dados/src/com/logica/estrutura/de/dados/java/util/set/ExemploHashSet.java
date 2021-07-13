package com.logica.estrutura.de.dados.java.util.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double> notasAlunos = new HashSet<Double>();
		
		notasAlunos.add(1.0);
		notasAlunos.add(2.0);
		notasAlunos.add(3.0);
		notasAlunos.add(4.0);
		notasAlunos.add(5.0);
		notasAlunos.add(6.0);
		notasAlunos.add(7.0);
		notasAlunos.add(8.0);
		notasAlunos.add(9.0);
		notasAlunos.add(10.0);
		
		System.out.println(notasAlunos);
		
	}
}
