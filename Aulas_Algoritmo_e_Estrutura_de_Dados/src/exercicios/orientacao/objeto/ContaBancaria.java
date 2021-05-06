/**
 * 
 */
package exercicios.orientacao.objeto;

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
	
	
	
}
