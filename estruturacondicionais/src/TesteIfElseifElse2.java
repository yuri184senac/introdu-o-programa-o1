import java.util.Scanner;

public class TesteIfElseifElse2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		float salarioBase;
		float impostoRenda;
		float aliquota;
		float deducao;
		
		System.out.println("Quanto é o seu salário base ?");
		salarioBase = ler.nextFloat();
		if (salarioBase >= 4664.68) {
			aliquota = 27.5f/100;
			deducao = 869.36f;
			impostoRenda = (salarioBase*aliquota) - deducao;
		} else if (salarioBase >= 3751.06) {
			aliquota = 22.5f/100;
			deducao = 636.13f;
			impostoRenda = (salarioBase*aliquota) - deducao;
			} else if (salarioBase >= 2826.66f ) {
				aliquota = 15f/100;
				deducao = 354.80f;
				impostoRenda = (salarioBase*aliquota) - deducao;
			} else {
				aliquota = 0;
				deducao = 0;
				impostoRenda = (salarioBase*aliquota) - deducao;
			}
		
		System.out.println("imposto de renda R$:"+impostoRenda);
	}

}
