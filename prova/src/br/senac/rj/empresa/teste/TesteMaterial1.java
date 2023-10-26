package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Material;

public class TesteMaterial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Material mt = new Material();
		int option;
		
		do {
			System.out.println("MENU");
			System.out.println("1-Cadastrar material");
			System.out.println("2-Entrada de material");
			System.out.println("3-Saída de material");
			System.out.println("4-Consulta saldo em estoque");
			
			System.out.print("Digite a opção:");
			option = Integer.parseInt(sc.next());
			
			switch (option) {
			case 1:
				System.out.print("Código do material:");
				int cod = Integer.parseInt(sc.next());
				System.out.print("Descrição do material:");
				String desc = sc.next();
				mt.cadastrarMaterial(cod, desc);
			break;
			case 2:
				
			}
		} while(option != 5);
	}

}
