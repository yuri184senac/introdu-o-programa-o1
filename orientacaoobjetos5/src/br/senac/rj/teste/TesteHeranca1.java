package br.senac.rj.teste;

import java.util.Scanner;

public class TesteHeranca1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o limite da conta especial: ");
		double limite = Double.parseDouble(sc.nextLine());
		System.out.println("Entrar com o valor a sacar: ");
		double valorSaque = Double .parseDouble(sc.nextLine());
		ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial();
		cce1.setLimite(limite);
		if (!cce1.sacar(valorSaque)) {
			System.out.println("Não foi possível efetuar o saque na conta corrente especial!");
		} else {
			System.out.println("Novo saldo da conta corrente especial = "+ cce1.getSaldo());
		}
		ContaCorrenteNormal ccn1 = new ContaCorrenteNormal();
		if (!ccn1.sacar(valorSaque)) {
			System.out.println("Não foi possível efetuar saque na conta corrente normal!");
		} else {
			System.out.println("Novo saldo da conta corrente normal = "+ ccn1.getSaldo());
		}
		
		sc.close();		
	}

}
