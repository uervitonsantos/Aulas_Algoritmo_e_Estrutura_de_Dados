/**
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até que o usuário informe um valor 
 * válido.
 * 
 */
package exercicios.logica.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Entre com uma nota entre 0 e 10: ");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou a nota: " + nota);

			} else {

				System.out.println("Nota invalida! Entre com uma nota entre 0 e 10: ");
			}
		} while (notaValida == false);

	}

}
