/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.vetores;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exe37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");

		int ip = scan.nextInt();

		decimalConverção(ip);


	}

	private static void decimalConverção(int ip) {
		
		if (ip > 0) {
			decimalConverção(ip / 2);
			System.out.print(ip % 2);
		}

	}

}