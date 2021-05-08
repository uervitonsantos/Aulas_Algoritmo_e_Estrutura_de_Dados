/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer31A {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario = 1000; // SALARIO BASE DE 1995
		double percentual = 0.2; // AJUSTE SALARIAL EM 1996

		salario += (salario / 100) * percentual;

		DecimalFormat format = new DecimalFormat("###,###.##");

		for (int i = 1997; i <= 2021; i++) {
			percentual ++;

			salario += (salario / 100) * percentual;

			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
	}

}
