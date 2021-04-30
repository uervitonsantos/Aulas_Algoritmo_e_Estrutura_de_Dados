/**
 Altere o programa anterior para mostrar no final a soma dos números.
 */
package exercicios.logica.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		int soma = 0;

		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();

		for (int i = num1; i <= num2; i++) {
			soma += i;
			System.out.print(i + " ");
		}
		System.out.println("Soma: " + soma);
	}

}
