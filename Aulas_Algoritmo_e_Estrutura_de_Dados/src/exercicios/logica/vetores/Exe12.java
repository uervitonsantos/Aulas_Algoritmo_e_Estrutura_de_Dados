/**
 * 
 */
package exercicios.logica.vetores;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exe12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da possição:  " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
		}
		System.out.println();
		System.out.println("Soma" + soma);
	}

}
