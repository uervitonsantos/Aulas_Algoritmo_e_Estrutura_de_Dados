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
public class Exer31 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario = 1000; // SALARIO BASE DE 1995
		double percentual = 1.5; // AJUSTE SALARIAL EM 1996

		salario += (salario / 100) * percentual;

		DecimalFormat format = new DecimalFormat("###,###.##");

		for (int i = 1997; i <= 2021; i++) {
			percentual *= 2;

			salario += (salario / 100) * percentual;

			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
	}

}
