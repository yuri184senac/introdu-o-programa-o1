package br.senac.rj.teste;

public class ContaCorrenteEspecial extends Conta {
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		// TODO Auto-generated method stub
		double novoSaldo = this.saldo - valor;
		if (novoSaldo < this.limite*-1) {
			System.out.println("Não há limite disponível");
			return false;
		}
		this.saldo = novoSaldo;
		return true;
	}
	
	
}
