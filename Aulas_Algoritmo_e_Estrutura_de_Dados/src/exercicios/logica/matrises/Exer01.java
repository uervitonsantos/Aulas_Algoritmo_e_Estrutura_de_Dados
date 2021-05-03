/**
 * 
 */
package exercicios.logica.matrises;

import java.util.Random;

/**
 * @author uerviton
 *
 */
public class Exer01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numerosRand = new int[4][4];

		Random numeros = new Random();

		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numerosRand.length; i++) {
			for (int j = 0; j < numerosRand.length; j++) {
				numerosRand[i][j] = numeros.nextInt(100);
				if (numerosRand[i][j] > maior) {
					maior = numerosRand[i][j];
					linha = i;
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
		System.out.println();
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
	}
}
