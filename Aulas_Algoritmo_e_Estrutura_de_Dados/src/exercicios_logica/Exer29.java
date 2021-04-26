/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer29 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero: ");
		int num = scan.nextInt();

		boolean primo;

		for (int i = 1; i <= num; i++) {
			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}

			}

			if (primo) {
				System.out.println("É um numero primo: " + i);
			}

		}
	}

}
