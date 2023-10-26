package variaveis;

public class TesteConversaoVariaveis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conversão Implícita de tipo
		int a = 5;
		float b = 10.5f; //precisa colocar o f para indicar que é um float e nao um double
		b = a;
		//Conversão Excplícita de tipo
		int c = (int)b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}

}
