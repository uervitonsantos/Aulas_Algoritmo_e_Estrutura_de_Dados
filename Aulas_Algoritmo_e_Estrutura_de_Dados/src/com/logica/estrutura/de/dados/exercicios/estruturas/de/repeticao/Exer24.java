/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

/**
 * @author uerviton.santos
 *
 */
public class Exer24 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		float precoPao = (float) 0.18;

		System.out.println("O preço do pão é R$ 0,18");
		System.out.println("Panificadora - Tabela de preços: ");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (precoPao * i));

		}

	}

}
