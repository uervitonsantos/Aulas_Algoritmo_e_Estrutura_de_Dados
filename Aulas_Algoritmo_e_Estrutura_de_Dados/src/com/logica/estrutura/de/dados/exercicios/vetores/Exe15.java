/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.vetores;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exe15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		int soma = 0;
		int impar = 0;
		int par;
		double porcPar;
		double porcImpar;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da possição:  " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		par = vetorA.length - impar;
		porcPar = (par * 100) / vetorA.length;
		porcImpar = 100 - porcPar;

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "");
		}
		System.out.println();
		System.out.println("Porcentagem Pares: " + porcPar);
		System.out.println("Porcentagem Impares: " + porcImpar);
	}

}
