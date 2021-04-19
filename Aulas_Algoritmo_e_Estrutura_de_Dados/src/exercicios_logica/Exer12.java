/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Entre com o numero para gerar a tabuada: ");

		num = scan.nextInt();

		System.out.println("Tabuada de " + num + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}

	}

}
