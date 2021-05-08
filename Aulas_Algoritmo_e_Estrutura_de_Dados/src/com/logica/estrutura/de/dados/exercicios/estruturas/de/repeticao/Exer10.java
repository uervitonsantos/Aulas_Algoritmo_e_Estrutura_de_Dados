/**
 .Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles.
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
			
		}
	}

}
