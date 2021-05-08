package com.logica.estrutura.de.dados.vetores;

//Algoritmo que capitura a temperatura media de 365 dias

public class Temperatura {

	public static void main(String[] args) {
		double[] temperatura = new double[365];

		for (int i = 0; i < temperatura.length; i++) {
			int rnd = (int) (1 + Math.random() * 45);
			temperatura[i] = rnd;

		}

		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("A temperatura m�dia verificada no dia " + (i + 1) + " foi: " + temperatura[i]);

		}

		System.out.println("================================================================");

		System.out.println("Quantidades de dias avliados: " + temperatura.length);
	}

}
