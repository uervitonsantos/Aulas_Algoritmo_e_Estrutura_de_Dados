/**
 * 
 */
package operadores.relacionais;

import java.util.Scanner;

/**
 * @author uerviton.santos
 *
 */
public class ifeelse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor: ");	
		
		double preco = scan.nextInt();
		
		if (preco < 10) {
			System.out.println("O preço esta bom para comprar");
			
		}
		if (preco == 10) {
			System.out.println("O preço esta normal para comprar");
		}
		
		if (preco > 10 && preco<= 15) {
			System.out.println("O preço esta normal para comprar");
		}
		
		if (preco > 15 && preco < 20) {
			System.out.println("O preço esta caro, tente pesquisar mais!");
		}
		else if (preco >= 20 ) {
			System.out.println("Não compre, esta muito caro!");
			
		}
		
	}

}
