package br.senac.rj.teste;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteClasseLocalDate2 {

	private static LocalDate converterData(String data) {
		return LocalDate.of(Integer.valueOf(data.substring(6, 10)), 
				Integer.valueOf(data.substring(3, 5)), 
				Integer.valueOf(data.substring(0, 2)));
	}
	
	private static boolean verificarIntercalacao(LocalDate dataInicio1, 
			LocalDate dataTermino1, LocalDate dataInicio2, LocalDate dataTermino2 ) {
		return ((dataInicio2.isBefore(dataTermino1)||dataInicio2.isEqual(dataTermino1))&&
				(dataTermino2.isAfter(dataInicio1)||dataTermino2.isEqual(dataInicio1)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com a data de início do período1: ");
		LocalDate dataInicio1 = converterData(sc.nextLine());
		System.out.print("Entre com a data de término do período1: ");
		LocalDate dataTermino1 = converterData(sc.nextLine());
		System.out.print("Entre com a data de início do período2: ");
		LocalDate dataInicio2 = converterData(sc.nextLine());
		System.out.print("Entre com a data de término do período2: ");
		LocalDate dataTermino2 = converterData(sc.nextLine());
		System.out.println(verificarIntercalacao(dataInicio1, dataTermino1, dataInicio2, dataTermino2) ? "Intercalados" : "Não intercalados");
		sc.close();
	}
}
