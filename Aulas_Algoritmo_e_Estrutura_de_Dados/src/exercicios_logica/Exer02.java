/**
 * Faça um programa que leia um nome de usuário e a sua senha 
 * e não aceite a senha igual ao nome do usuário, mostrando 
 * uma mensagem de erro e voltando a pedir as informações.
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class Exer02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String login;
		String senha;


		boolean acessoValida = false;

		do {
			System.out.print("Entre com login: ");
			login = scan.next();

			System.out.print("Entre com a senha: ");
			senha = scan.next();

			if (login.equalsIgnoreCase(senha)) {
				System.out.println("login e senha ivalodos ");

			} else {
				acessoValida = true;
				System.out.println("Seu login e senha: " + login + " " + senha);

			}
		} while (!acessoValida);

	}

}
