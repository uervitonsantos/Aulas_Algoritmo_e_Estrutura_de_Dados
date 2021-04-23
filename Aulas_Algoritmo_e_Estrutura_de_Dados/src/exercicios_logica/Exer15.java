/**
 * 
 */
package exercicios_logica;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com on-ésimo termo: ");

		int num = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; i <= num; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
			
		}
		
		
	}

}
