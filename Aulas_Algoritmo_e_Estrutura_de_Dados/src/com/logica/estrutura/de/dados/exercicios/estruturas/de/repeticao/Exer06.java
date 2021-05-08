/**
 *Fa�a um programa que imprima na tela os n�meros de 1 a 20, 
 *um abaixo do outro. Depois modifique o programa para que 
 *ele mostre os n�meros um ao lado do outro.
 * 
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

/**
 * @author uerviton.santos
 *
 */
public class Exer06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
			System.out.println();

		}
		for (int j = 0; j <= 20; j++) {

			System.out.print(j + " ");
		}

	}
}
