package com.logica.estrutura.de.dados.matriz;

public class MatrizBidimensional2 {

	public static void main(String[] args) {

		double[][] notasAlunos = { { 10, 7, 9, 9.5 }, { 10, 5, 8, 5.5 }, { 10, 4, 9, 7.5 } };

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
			System.out.println("M�dia do Aluno: " + soma / 4);
			System.out.println("===============================================");
		}

	}

}
