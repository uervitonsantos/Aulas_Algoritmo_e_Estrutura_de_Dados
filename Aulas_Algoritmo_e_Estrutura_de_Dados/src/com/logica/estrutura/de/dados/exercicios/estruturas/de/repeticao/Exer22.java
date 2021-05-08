/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer22 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o números de CD's: ");

		int cds = scan.nextInt();
		double preco;
		double soma = 0;
		double media;

		for (int i = 1; i <= cds; i++) {

			System.out.println("Informe o valor do CD: " + i);
			preco = scan.nextDouble();

			soma += preco;

		}

		media = soma / cds;

		System.out.println("Média gasta com a coleção de CD's: " + media);
	}

}
