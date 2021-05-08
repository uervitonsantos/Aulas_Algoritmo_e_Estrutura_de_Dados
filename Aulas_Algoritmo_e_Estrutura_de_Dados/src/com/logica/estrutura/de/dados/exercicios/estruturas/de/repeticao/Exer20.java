/**
 * Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera verificar se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada.
 */
package com.logica.estrutura.de.dados.exercicios.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero de idades: ");
		int idades = scan.nextInt();

		int soma = 0;
		double media;
		int idade;

		for (int i = 0; i < idades; i++) {
			System.out.println("Entre com a idade: " + (i + 1));
			idade = scan.nextInt();

			soma += idade;

		}

		media = soma / idades;

		if (media > 0 && media <= 12) {
			System.out.println("� uma media de idades de crian�a");
		}

		else if (media >= 13 && media <= 23) {
			System.out.println("� uma media de idades de jovem adulto");
		}

		else if (media >= 24 && media <= 60) {
			System.out.println("� uma media de idades de adulto");
		}

		else if (media > 60) {
			System.out.println("� uma media de idades de idoso");
		}
		System.out.println("");
		System.out.println("======================= RELAT�RIO =======================");
		System.out.println("SOMA DAS IDADES: " + soma);
		System.out.println("IDADE M�DIA: " + media);
		System.out.println("M�DIA DE IDADES: " + soma + " / " + idades + " = " + media);

	}

}
