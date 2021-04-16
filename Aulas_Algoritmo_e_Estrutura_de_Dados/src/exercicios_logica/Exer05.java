/**
  Altere o programa anterior permitindo ao usuário informar 
  as populações e as taxas de crescimento iniciais. 
  Valide a entrada e permita repetir a operação. 
 */

package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer05 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA;
		double popB;
		double taxaA;
		double taxaB;
		boolean validade = false;

		do {

			System.out.print("Digite a densidade populacional para o pais A: ");
			popA = scan.nextDouble();
			if (popA > 0) {
				validade = true;
			} else {
				System.out.print("Densidade populacional deve ser maior que 0!");
			}
		} while (!validade);

		validade = false;

		do {
			System.out.print("Digite a taxa de crescimento do pais A: ");
			taxaA = scan.nextDouble();
			if (taxaA > 0) {
				validade = true;
			} else {
				System.out.print("Taxas de crescimento deve ser maior que 0!");
			}
		} while (!validade);

		validade = false;

		do {
			System.out.print("Digite a densidade populacional para o pais B:");
			popB = scan.nextDouble();
			if (popB > 0) {
				validade = true;
			} else {
				System.out.println("Densidade populacional deve ser maior que 0!");
			}
		} while (!validade);

		validade = false;

		do {
			System.out.print("Digite a taxa de crescimento do pais B: ");
			taxaB = scan.nextDouble();
			if (taxaB > 0) {
				validade = true;
			} else {
				System.out.print("Taxas de crescimento deve ser maior que 0!");
			}
		} while (!validade);

		int cont = 0;

		while (popA <= popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;

		}

		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);
	}

}
