/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer30 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int numInicio;
		int numFinal;
		boolean invalido;

		System.out.print("Entre com o numero para gerar a tabuada: ");
		num = scan.nextInt();

		invalido = true;

		do {
			System.out.print("Entre com o inicio da tabuada: ");
			numInicio = scan.nextInt();

			System.out.print("Entre com o final da tabuada: ");
			numFinal = scan.nextInt();

			if (numFinal > numInicio) {
				invalido = false;
			}

		} while (invalido);

		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começar por " + numInicio);
		System.out.println("Terminar em " + numFinal);
		System.out.println();

		for (int i = numInicio; i <= numFinal; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}

	}

}
