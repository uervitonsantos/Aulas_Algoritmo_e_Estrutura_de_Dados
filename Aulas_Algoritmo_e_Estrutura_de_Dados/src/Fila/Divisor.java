/**
 Pense um número positivo n. Agora me diga um divisor A de n. Agora me dê um
outro número B que não seja divisor de n. Agora um múltiplo C. E um não
múltiplo D. O número que você pensou é...
Parece um truque de mágica, mas é matemática! Será que, conhecendo os números
A, B, C e D, você consegue descobrir qual era o número original n? Note que
pode existir mais de uma solução!
Neste problema, dados os valores de A, B, C e D, você deve escrever um programa
que determine qual o menor número n que pode ter sido pensado ou concluir que
não existe um valor possível.
- Entrada
A entrada consiste de uma única linha que contém quatro números inteiros A, B,
C, e D, como descrito acima (1 ≤ A, B, C, D ≤ 109).
- Saída
Seu programa deve produzir uma única linha. Caso exista pelo menos um número n
para os quais A, B, C e D façam sentido, a linha deve conter o menor n
possível. Caso contrário, a linha deve conter -1. 
 */

package Fila;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author uerviton
 *
 */
public class Divisor {

	/**
	 * @param args
	 */
	
		static int A, B, C, D;
		
		 public static void main(String[] args) throws IOException {

	            Scanner s= new Scanner(System.in);
	        long a,b,c,d;
	        a=s.nextLong();
	        b=s.nextLong();
	        c=s.nextLong();
	        d=s.nextLong();
	        boolean cont=true;

	    if(c<=1000000){
	        for(long i=1;i<=c;i++){
	            if(i%a==0 && i%b!=0 && c%i==0 && d%i!=0){
	                System.out.println(i);
	                cont=false;
	                break;
	            }
	        }
	    }
	    else {
	        for(long i=1;i<=Math.sqrt(c);i++){
	            if(i%a==0 && i%b!=0 && c%i==0 && d%i!=0){
	                System.out.println(i);
	                cont=false;
	                break;
	            }
	        }
	    }
	        if(cont==true)System.out.println("-1");

	        s.close();

	    }

	}