/**
 * 
 */
package com.lgica.estrutura.de.dados.exercicios.recursividade;

/**
 * @author uerviton
 *
 */
public class TesteCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Não Recursivo: " + fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println("Recursivo: " + fatorialR);
	}

}
