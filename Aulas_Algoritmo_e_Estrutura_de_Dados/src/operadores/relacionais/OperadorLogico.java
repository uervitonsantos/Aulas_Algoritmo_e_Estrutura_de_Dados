/**
 * 
 */
package operadores.relacionais;

/**
 * @author uerviton.santos
 *
 */
public class OperadorLogico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int verdadeiro = 1;
		int falso = 0;

		boolean a = verdadeiro == falso;
		boolean b = verdadeiro != falso;
		boolean c = verdadeiro > falso;
		boolean d = verdadeiro >= falso;
		boolean e = verdadeiro < falso;
		boolean f = verdadeiro <= falso;

		System.out.println("(Verdadeiro == Falso é igual): " + a);
		System.out.println("(Verdadeiro != Falso é igual): " + b);
		System.out.println("(Verdadeiro > Falso é igual): " + c);
		System.out.println("(Verdadeiro >= Falso é igual): " + d);
		System.out.println("(Verdadeiro < Falso é igual): " + e);
		System.out.println("(Verdadeiro <= Falso é igual): " + f);

	}

}
