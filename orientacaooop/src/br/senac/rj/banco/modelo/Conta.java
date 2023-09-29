package br.senac.rj.banco.modelo;
//ALT + SHIFT + R
public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public boolean saca(double valor) {
		double novoSaldo = getSaldo() - valor;
		if (novoSaldo < 0) {
			return false;
		}
		setSaldo(novoSaldo);
		return true;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
