/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
	}
}
