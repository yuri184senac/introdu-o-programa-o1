package br.senac.rj.teste;

public class Conta {
	private String titular;
	private int agencia;
	private int numero;
	protected double saldo;
	
	Conta() {
		this.titular = "";
	}
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}
	
	
	public boolean sacar(double valor) {
		double novoSaldo = this.saldo - valor;
		if (novoSaldo < 0) {
			return false;
		} else {
			this.saldo = novoSaldo;
			return true;
		}
	}

	
}
