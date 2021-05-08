/**
 * Fa�a um programa que calcule o mostre a m�dia aritm�tica de N notas.
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero de notas: ");
		double notas = scan.nextDouble();

		double soma = 0;
		double media;
		double nota;

		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota: " + (i + 1));
			nota = scan.nextDouble();

			soma += nota;

		}

		media = soma / notas;
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
	}

}
