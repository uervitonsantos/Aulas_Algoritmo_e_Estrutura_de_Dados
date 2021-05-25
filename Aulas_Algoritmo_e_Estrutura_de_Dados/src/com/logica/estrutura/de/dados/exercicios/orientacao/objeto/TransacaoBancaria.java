/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.orientacao.objeto;

import java.util.Calendar;

/**
 * @author uerviton
 *
 */
public class TransacaoBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaBancaria carro = new ContaBancaria();
		
		carro.setId(1);
		carro.setAgencia(01);
		carro.setConta(012345);
		carro.setSaldo(1985.43);
		carro.setChequeEspecial(1);
		carro.setData(Calendar.getInstance().getTime());
		carro.setClienteAtivo(true);

		System.out.println(carro.getAgencia());

	}

}
