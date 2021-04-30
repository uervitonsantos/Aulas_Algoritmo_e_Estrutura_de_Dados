// Encontre a maior substring

/* Encontre a maior substring comum entre as duas strings informadas.
A substring pode ser qualquer parte da string, inclusive ela toda. Se não
houver subsequência comum, a saída deve ser “0�?. A comparação é case sensitive
('x' != 'X').
- Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas
linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1
e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma
letra ('A'-'Z','a'-'z').
- Saída
O tamanho da maior subsequência comum entre as duas Strings. */

package exercicios.digital.innovation.one;

import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class MaiorSubstringComum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        String palavra1;
        String palavra2;
        
        while(scr.hasNextLine()) {
            palavra1 = scr.nextLine();
            palavra2 = scr.nextLine();
            int tamanhoMax = 0;
    
            if (palavra2.length() > palavra1.length()) {
                String maiorPalavra = palavra2;
                palavra2 = palavra1;
                palavra1 = maiorPalavra;
            }
    
            for (int i = 0; i < palavra2.length(); i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (palavra1.contains(palavra2.substring(j, palavra2.length() - i + j))) {
                        tamanhoMax = Math.max(tamanhoMax, palavra2.length() - i);
                    }
                }
            }
    
            System.out.println(tamanhoMax);
        }
    }
}
