package br.senac.rj.teste;

import java.util.Scanner;

public class TesteClassScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com a nota 1: ");
		double nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Entre com a nota 2:");
		double nota2 = Double.parseDouble(sc.nextLine());
		double media = (nota1 + nota2)/2;
		System.out.println("A média do aluno "+ nome + " é " + media);
		sc.close();
	}

}
