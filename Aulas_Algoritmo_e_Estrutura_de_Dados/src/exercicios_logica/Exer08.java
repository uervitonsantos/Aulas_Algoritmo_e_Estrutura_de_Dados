/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		double media;
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();

			soma += num;

		}
		media = soma / 5;

		System.out.println("A soma dos numeros digitados foi: " + soma);
		System.out.println("A media dos numeros digitados foi: " + media);

	}

}
