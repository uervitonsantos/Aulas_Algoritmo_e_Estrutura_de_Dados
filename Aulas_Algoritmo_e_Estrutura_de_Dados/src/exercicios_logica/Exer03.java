/**
 *Faça um programa que leia e valide as seguintes 
 *informações: a. Nome: maior que 3 caracteres; 
 *b. Idade: entre 0 e 150; c. Salário: maior que 
 *zero; d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd'; 
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer03 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		String nome;
		int idade;
		double salario;
		String sexo;
		String civil;

		boolean validade = false;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		do {
			// Validação do NOME
			System.out.print("Entre com o nome: ");
			nome = scan.next();

			if (nome.length() >= 3) {
				validade = true;
			} else {
				System.out.println("Nome invalido!");
			}
		} while (!validade);

		validade = false;

		do {
			// Validação da IDADE
			System.out.print("Entre com a idade: ");
			idade = scan.nextInt();

			if (idade > 0 && idade <= 150) {
				validade = true;

			} else {
				System.out.println("Nome invalido!");
			}

		} while (!validade);

		validade = false;

		do {
			// Validação da SALARIO
			System.out.print("Entre com o salario: ");
			salario = scan.nextFloat();

			if (salario > 0) {
				validade = true;

			} else {
				System.out.println("Salario invalido!");
			}

		} while (!validade);

		validade = false;

		do {
			// Validação da SEXO

			System.out.print("Entre com o sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				validade = true;

			} else {
				System.out.println("Sexo invalido!");
			}

		} while (!validade);

		validade = false;

		do {
			// Validação da SEXO

			System.out.print("Entre com o estado civil: ");
			civil = scan.next();

			if (civil.equalsIgnoreCase("S") || civil.equalsIgnoreCase("C") || civil.equalsIgnoreCase("V")
					|| civil.equalsIgnoreCase("D")) {
				validade = true;

			} else {
				System.out.println("Estado Civil invalido!");
			}

		} while (!validade);

		System.out.println("Nome " + '(' + nome + ')' + " é valida!");
		System.out.println("Idade " + '(' + idade + ')' + " é valida!");
		System.out.println("Salario " + '(' + "R$ " + salario + ')' + " é valida!");
		System.out.println("Sexo " + '(' + sexo + ')' + " é valida!");
		System.out.println("Estado Civil " + '(' + civil + ')' + " é valida!");

	}

}
