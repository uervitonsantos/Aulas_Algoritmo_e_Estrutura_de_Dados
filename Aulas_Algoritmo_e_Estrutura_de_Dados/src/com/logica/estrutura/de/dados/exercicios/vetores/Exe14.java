/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.vetores;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exe14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;
		int impar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da possição:  " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
		}
		System.out.println();
		System.out.println("Soma" + soma);
		System.out.println("Média" + (soma / impar));
	}
}
