/**
 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
 */
package exercicios.logica.estruturas.de.repeticao;

/**
 * @author uerviton
 *
 */
public class Exer09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 50;
		for (int i = 1; i < num; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");

			}

		}

	}

}
