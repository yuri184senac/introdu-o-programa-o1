
public class TesteConversaoVariaveis1 {

	public static void main(String[] args) {
		
		int a = 5;
		float b = 10.5f; //precisa colocar letra f no final para que seja considerada float e não double
		b = a;
		
		// Conversão explícita de tipo
		int c = (int) b; //exemplo de Cast
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
