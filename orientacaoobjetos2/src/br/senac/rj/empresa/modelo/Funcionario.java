package br.senac.rj.empresa.modelo;

public class Funcionario {
	private int registro;
	private String nome;
	private int cargo;
	private double salario;
	
	public int getRegistro() {
		return registro;
	}


	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


	public void setSalario(double sal) {
		this.salario = sal;
	}
	
	public double getSalario() {
		return salario;
	}
	
	
	
	
	public void aplicarBonificacao(int bonus) {
		switch (bonus) {
			case 1:
				this.salario = this.salario + (this.salario * 20/100);
			
			case 2:
				this.salario = this.salario + (this.salario * 40/100);
			
			case 3:
				this.salario = this.salario + (this.salario * 60/100);
			
			default:
				this.salario = this.salario;
		}
		
	}


	
}
