/**
 * 
 */
package exercicios_logica;

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

		System.out.println("Entre com um número: ");
		
		double numero = scan.nextDouble();
		double soma = 0;
		
		soma = numero * 0.18;
		
		System.out.println("R$ " + soma);

		
	}

}
