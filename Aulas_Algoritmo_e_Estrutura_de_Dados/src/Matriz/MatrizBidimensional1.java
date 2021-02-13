package Matriz;

public class MatrizBidimensional1 {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 5;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 6.5;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 4.6;
		notasAlunos[2][2] = 9.5;
		notasAlunos[2][3] = 3.5;

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("NOTA: " + notasAlunos[i][j]);
			}
			
		}

			double soma;
			for (int i = 0; i < notasAlunos.length; i++) {
				
				soma = 0;
				for (int j = 0; j < notasAlunos.length; j++) {
					soma += notasAlunos[i][j];
					
					
				}
				System.out.println("Média do Aluno: " + soma / 4);
				System.out.println("===============================================");
			}

		}
	}