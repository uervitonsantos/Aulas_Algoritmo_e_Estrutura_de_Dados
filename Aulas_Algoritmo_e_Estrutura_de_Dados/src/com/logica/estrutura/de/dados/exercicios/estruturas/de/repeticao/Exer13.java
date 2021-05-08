/**
 * Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem.
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int base;
		int pot;

		System.out.println("Entre com o numero da base: ");
		base = scan.nextInt();

		System.out.println("Entre com o numero da potência: ");
		pot = scan.nextInt();

		int resutado = base;

		for (int i = 1; i < pot; i++) {
			resutado *= base;

		}
		System.out.println("Resultado: " + resutado);
	}
}
