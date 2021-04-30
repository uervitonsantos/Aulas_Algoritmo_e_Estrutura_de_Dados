/**
 * 
 */
package exercicios.logica.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = scan.nextInt();

		System.out.println(num + "! = ");

		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		System.out.println("Resultado:  " + fatorial);

	}
}
