/**
 * 
 */
package exercicios_logica;

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
