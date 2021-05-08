/**
 * 
 */
package com.logica.estrutura.de.dados.operadores.relacionais;

/**
 * @author uerviton.santos
 *
 */
public class OperadorLogico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int verdadeiro = 1;
		int falso = 0;

		boolean a = verdadeiro == falso;
		boolean b = verdadeiro != falso;
		boolean c = verdadeiro > falso;
		boolean d = verdadeiro >= falso;
		boolean e = verdadeiro < falso;
		boolean f = verdadeiro <= falso;

		System.out.println("(Verdadeiro == Falso � igual): " + a);
		System.out.println("(Verdadeiro != Falso � igual): " + b);
		System.out.println("(Verdadeiro > Falso � igual): " + c);
		System.out.println("(Verdadeiro >= Falso � igual): " + d);
		System.out.println("(Verdadeiro < Falso � igual): " + e);
		System.out.println("(Verdadeiro <= Falso � igual): " + f);

	}

}
