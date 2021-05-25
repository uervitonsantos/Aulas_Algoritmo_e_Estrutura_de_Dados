/**
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

 
Exemplo de Entrada	Exemplo de Saída
6 24

Sao Multiplos

6 25

Nao sao Multiplos
 */
package com.logica.exercicios.digital.innovation.one;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Multiplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		int valor1 = 0;
		int valor2 = 0;
		int multiplo = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextInt();

		System.out.println("Digite o segundo valor: ");
		valor2 = scan.nextInt();

		if (valor2 % valor1 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}

	}

}
