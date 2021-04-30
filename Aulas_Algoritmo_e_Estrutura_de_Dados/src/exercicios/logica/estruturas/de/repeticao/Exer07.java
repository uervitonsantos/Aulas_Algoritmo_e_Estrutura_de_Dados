/**
 * 
 */
package exercicios.logica.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
				System.out.println("O numero maior mudou: " + maior);
			}
		}
		System.out.println("O maior numero digitado foi: " + maior);
	}

}
