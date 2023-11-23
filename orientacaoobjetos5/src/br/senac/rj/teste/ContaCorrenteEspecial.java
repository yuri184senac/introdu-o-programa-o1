package br.senac.rj.teste;

public class ContaCorrenteEspecial extends Conta {
	private double limite;
	
	public ContaCorrenteEspecial(int numAgencia, int numConta) {
		super(numAgencia, numConta);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	/*CRIOU OUTRA CLASSE NO Conta.java*/
	@Override
	public boolean sacar(double valor, int imposto) {
		// TODO Auto-generated method stub
		double novoValorSaque = valor + (valor*imposto/100);
		System.out.println("Imposto = " + imposto + "%");
		System.out.println("Novo valor a sacar = " + novoValorSaque);
		if (!this.sacar(novoValorSaque))
			return false;
		return true;
	}
	
}
