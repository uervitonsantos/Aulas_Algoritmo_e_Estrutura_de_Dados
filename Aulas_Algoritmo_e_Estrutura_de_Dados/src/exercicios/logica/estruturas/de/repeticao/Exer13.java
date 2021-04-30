/**
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
 */
package exercicios.logica.estruturas.de.repeticao;

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

		System.out.println("Entre com o numero da potÃªncia: ");
		pot = scan.nextInt();

		int resutado = base;

		for (int i = 1; i < pot; i++) {
			resutado *= base;

		}
		System.out.println("Resultado: " + resutado);
	}
}
