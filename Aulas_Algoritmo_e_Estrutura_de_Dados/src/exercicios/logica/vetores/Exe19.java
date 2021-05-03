/**
 * 
 */
package exercicios.logica.vetores;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exe19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas1 = new double[4];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		double media = 0;

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Entre com a nota 1 do aluno " + (i + 1));
			notas1[i] = scan.nextDouble();

			System.out.println("Entre com a nota 2 do aluno " + (i + 1));
			notas2[i] = scan.nextDouble();

			resultados[i] = (notas1[i] + notas2[i]) / 2;
		}

		System.out.print("Notas 1 = ");
		for (int i = 0; i < notas1.length; i++) {
			System.out.println(notas1[i] + "");
		}
		System.out.println();

		System.out.print("Notas 2 = ");
		for (int i = 0; i < notas2.length; i++) {
			System.out.println(notas2[i] + "");
		}
		System.out.println();

		System.out.println("Resultados: ");
		for (int i = 0; i < resultados.length; i++) {

			if (resultados[i] >= 7) {
				System.out.println(resultados[i] + " - Aprovado");
			} else {
				System.out.println(resultados[i] + " - Reprpovado");
			}

		}

	}

}
