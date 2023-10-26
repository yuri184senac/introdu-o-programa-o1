package br.senac.rj.teste;

public class TesteClassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = " Ricardo ";
		int idade = 20;
		System.out.println("nome ="+nome);
		char posicao3 = nome.charAt(3);
		boolean vazio = nome.isEmpty(); // retorna FALSE se tiver espacos em branco
		boolean emBranco = nome.isBlank();//retona TRUE se tiver espacos em branco
		int tamanho = nome.length();
		String parte = nome.substring(0, 4);
		String minuscula = nome.toLowerCase();
		String maiuscula = nome.toUpperCase();
		String semEspaco = nome.trim();
		String converteString = String.valueOf(idade);
		
		System.out.println("nome:"+nome);
		System.out.println("idade:"+idade);
		System.out.println("posicao3:"+posicao3);
		System.out.println("vazio:"+vazio);
		System.out.println("em branco:"+emBranco);
		System.out.println("tamanho:"+tamanho);
		System.out.println("parte:"+parte);
		System.out.println("minuscula:"+minuscula);
		System.out.println("maiuscula:"+maiuscula);
		System.out.println("semEspaco:"+semEspaco);
		System.out.println("Converte String: "+converteString);
		System.out.println("nome= \"RICARDO\" ="+ nome.trim().toUpperCase().equals("RICARDO"));
	}

}
