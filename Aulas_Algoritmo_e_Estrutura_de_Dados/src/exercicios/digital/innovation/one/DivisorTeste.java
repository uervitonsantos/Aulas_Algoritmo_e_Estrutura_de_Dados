package exercicios.digital.innovation.one;

import java.io.IOException;
import java.util.Scanner;

public class DivisorTeste {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de pessoas que serão entrevitadas: ");

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		if (A % 2 != 0) {
			System.out.println(-1);

		} else if (A % 2 == 0) {
			System.out.println(2);
		}

	}
}
