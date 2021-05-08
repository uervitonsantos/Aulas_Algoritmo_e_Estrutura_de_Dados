/**
 * 
 */
package com.logica.estrutura.de.dados.matriz;

/**
 * @author uerviton.santos
 *
 */
public class Questao2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double soma = 0;

		String[][] arr = new String[][] {

				{ "Molho de Tomate", "1.70" }, { "Filet Mignon", "39.90" }, { "Queijo Mussarela", "9.90" },
				{ "Farinha de Rosca", "4.90" }, { "Caixa de Ovos", "7.90" } };

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				soma = Double.parseDouble(arr[0][1]);
		soma += Double.parseDouble(arr[1][1]);
		soma += Double.parseDouble(arr[2][1]);
		soma += Double.parseDouble(arr[3][1]);
		soma += Double.parseDouble(arr[4][1]);

		System.out.println("Soma: " + "R$ " + soma);

	}

}
