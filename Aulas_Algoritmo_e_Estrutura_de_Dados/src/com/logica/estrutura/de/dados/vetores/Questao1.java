/**
 * 
 */
package com.logica.estrutura.de.dados.vetores;

import java.util.Arrays;

/**
 * @author uerviton.santos
 *
 */
public class Questao1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arr = new String[] { "Pera", "Banana", "Ma�a", "Abacaxi", "Uva", "Lim�o" };

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}

	}

}
