/**
 * 
 */
package exercicios.logica.estruturas.de.repeticao;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Exer18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		
		int num = scan.nextInt();
		boolean primo = true; 
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("N�o � primo pois � divis�vel por " + i);
				primo = false;
			}
			
		}
		
		if (primo) {
			System.out.println("� n�mero primo");
		}
	
	}

}
