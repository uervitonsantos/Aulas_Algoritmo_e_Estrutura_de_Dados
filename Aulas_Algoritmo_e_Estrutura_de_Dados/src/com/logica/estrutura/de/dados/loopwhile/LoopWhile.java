/**
 * 
 */
package com.logica.estrutura.de.dados.loopwhile;

/**
 * @author uerviton.santos
 *
 */
public class LoopWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 10;
		int i = 0;
		
		//Loop de 0 a 10 com WHILE

		while (i < n) {
			i++;
			System.out.println("Valor de i: " + i);

		}

		System.out.println("==========================================");
		
		//Loop de 0 a 10 com DO WHILE

		do {
			System.out.println("Valor de i: " + i);
			i++;
		} while (i <= n);
		System.out.println(i);

	}

}
