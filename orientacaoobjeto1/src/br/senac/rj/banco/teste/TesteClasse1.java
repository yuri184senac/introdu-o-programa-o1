package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Conta cn = new Conta();
		cn.setAgencia(1);
		cn.setNumero(22);
		
		int option;
		do {
			System.out.println("1-Consultar");
			System.out.println("2-Depositar");
			System.out.println("3-Sacar");
			System.out.println("4-Encerrar");
			option = Integer.parseInt(sc.next());
			
			switch(option) {
				case 1:
					System.out.println("Saldo da conta: R$ "+cn.getSaldo());					
				break;
				
				case 2:
					System.out.print("Insira o valor de depósito R$:");
					Double deposito = sc.nextDouble();
					cn.deposita(deposito);
				break;
				
				case 3:
					System.out.print("Informe o valor de saque R$:");
					Double saque = sc.nextDouble();
					cn.sacar(saque);
				break;
				case 4:
					System.out.println("Programa encerrado!");
					break;
				default:
					System.out.println("Opção inexistente");
				break;
			}
		} while(option!=4);
		sc.close();
	}

}
