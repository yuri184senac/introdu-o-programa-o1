package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		String resp = "s";
		String nome;
		int cargo;
		int registro;
		double salario;
		do {
			func.setNome("FULANO");
			System.out.print("Cargo do funcionário:");
			cargo = Integer.parseInt(sc.nextLine());
			func.setCargo(cargo);
			System.out.print("N de registro:");
			registro = Integer.parseInt(sc.nextLine());
			func.setRegistro(registro);
			System.out.print("Salário R$:");
			salario = Double.parseDouble(sc.nextLine());
			func.setSalario(salario);
			
			System.out.println("SAÍDA DE DADOS");
			System.out.println("Nome do funcionário:"+func.getNome());
			System.out.println("CARGO:"+func.getCargo());
			System.out.println("N de registro:"+func.getRegistro());
			System.out.println("Salário R$:"+func.getSalario());
			func.aplicarBonificacao(func.getCargo());
			System.out.println("Salário com bonificação R$"+func.getSalario());
			
			System.out.println("Deseja continuar (s/n): ");
			resp = sc.nextLine();
			while (!resp.toLowerCase().equals("s") && !resp.toLowerCase().equals("n")) {
				System.out.println("Resposta incorreta");
				System.out.println("Deseja continuar (s/n): ");
				resp = sc.nextLine();
			}
			System.out.print("\n");	
		} while(resp.contentEquals("s") || resp.contentEquals("S") );
		sc.close();	
		System.out.println("Você finalizou");
	
		
		
	}

}
