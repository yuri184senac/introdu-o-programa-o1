
public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 16;
		System.out.println("idade = " + idade);
		System.out.println(idade >= 18 ? "Adulto" : "Não é adulto");
		boolean votante;
		votante = (idade>=16) ? true : false;
		System.out.println(votante ? "Pode votar" : "Não pode votar");
	} 

}
