/**
 * 
 */
package com.logica.estrutura.de.dados.exercicios.orientacao.objeto;

import java.util.Date;

/**
 * @author uerviton
 *
 */
public class ContaBancaria {

	private long id;
	private int agencia;
	private int conta;
	private double saldo;
	private double chequeEspecial;
	private boolean clienteAtivo;
	private Date data;

	public ContaBancaria() {

	}

	/**
	 * @param id
	 * @param agencia
	 * @param conta
	 * @param saldo
	 * @param chequeEspecial
	 * @param clienteAtivo
	 * @param data
	 */
	public ContaBancaria(long id, int agencia, int conta, double saldo, double chequeEspecial, boolean clienteAtivo,
			Date data) {
		super();
		this.id = id;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.clienteAtivo = clienteAtivo;
		this.data = data;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the chequeEspecial
	 */
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	/**
	 * @param chequeEspecial the chequeEspecial to set
	 */
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	/**
	 * @return the clienteAtivo
	 */
	public boolean isClienteAtivo() {
		return clienteAtivo;
	}

	/**
	 * @param clienteAtivo the clienteAtivo to set
	 */
	public void setClienteAtivo(boolean clienteAtivo) {
		this.clienteAtivo = clienteAtivo;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		long temp;
		temp = Double.doubleToLongBits(chequeEspecial);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (clienteAtivo ? 1231 : 1237);
		result = prime * result + conta;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (agencia != other.agencia)
			return false;
		if (Double.doubleToLongBits(chequeEspecial) != Double.doubleToLongBits(other.chequeEspecial))
			return false;
		if (clienteAtivo != other.clienteAtivo)
			return false;
		if (conta != other.conta)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaBancaria [id=" + id + ", agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo
				+ ", chequeEspecial=" + chequeEspecial + ", clienteAtivo=" + clienteAtivo + ", data=" + data + "]";
	}

}
