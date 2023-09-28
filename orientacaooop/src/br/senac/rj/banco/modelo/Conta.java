package br.senac.rj.banco.modelo;

public class Conta {
	private int agencia;
	public int numero;
	public double saldo;
	
	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean saca(double valor) {
		double novoSaldo = saldo - valor;
		if (novoSaldo < 0) {
			return false;
		}
		saldo = novoSaldo;
		return true;
	}

}
