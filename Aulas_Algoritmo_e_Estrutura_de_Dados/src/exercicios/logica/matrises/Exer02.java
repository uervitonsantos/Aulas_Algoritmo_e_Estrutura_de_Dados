/**
 * 
 */
package exercicios.logica.matrises;

import java.util.Random;

/**
 * @author uerviton
 *
 */
public class Exer02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numerosRand = new int[10][10];

		Random numeros = new Random();

		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		int maiorC7 = 0;
		int menorC7 = Integer.MIN_VALUE;
		int coluna7 = 7;
		int coluna = 0;

		for (int i = 0; i < numerosRand.length; i++) {
			for (int j = 0; j < numerosRand.length; j++) {
				numerosRand[i][j] = numeros.nextInt(100);

				if (numerosRand[i][j] > maiorL5) {
					maiorL5 = numerosRand[i][j];
					linha5 = i;
					coluna = j;
				}
			}
		}
		for (int i = 0; i < numerosRand.length; i++) {
			for (int j = 0; j < numerosRand.length; j++) {
				System.out.print("[" + numerosRand[i][j] + "]" + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < numerosRand[5].length; i++) {
			if (numerosRand[5][i] < menorL5) {
				menorL5 = numerosRand[5][i];

			}
		}

		System.out.println();
		System.out.println("Maior valor: " + maiorL5);
		System.out.println("Menor valor: " + menorL5);
		System.out.println("Linha: " + linha5);
		System.out.println("Coluna: " + coluna);

		for (int i = 0; i < numerosRand.length; i++) {
			if (numerosRand[i][coluna7] > maiorC7) {
				maiorC7 = numerosRand[i][coluna7];

			}
			if (numerosRand[i][coluna7] < maiorC7) {
				maiorC7 = numerosRand[i][coluna7];

			}
		}

		System.out.println();
		System.out.println("Maior valor coluna 7: " + maiorC7);
		System.out.println("Menor valor coluna 7: " + menorC7);
		System.out.println("Coluna 7: " + coluna7);

	}

}
