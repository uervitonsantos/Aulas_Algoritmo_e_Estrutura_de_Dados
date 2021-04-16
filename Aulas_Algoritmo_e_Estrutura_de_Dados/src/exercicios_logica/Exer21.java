/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer21 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero de turmas: ");

		int numTurmas = scan.nextInt();
		int numAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= numTurmas; i++) {

			invalido = true;

			do {

				System.out.println("Entre com o numero de alunos da turma: " + i);
				numAlunos = scan.nextInt();

				if (numAlunos <= 40) {
					invalido = false;

				} else {
					System.out.println("N�mero de alunos inv�lido. Digite novamente: ");
				}

			} while (invalido);

			soma += numAlunos;

		}
		float media = soma / numTurmas;
		System.out.println("M�dia: " + media);

	}

}
