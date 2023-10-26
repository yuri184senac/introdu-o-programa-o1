package br.senac.rj.banco.modelo;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
	
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
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo = novoSaldo;
			return true;
		}
	}

	
}
