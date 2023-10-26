package variaveis;

public class TestesOperadoresIncrementoDecremento {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		System.out.println("Pré-fixado");
		int j = x++;
		System.out.println(j);// Repara que o valor de j não muda
		//porque o incremento de x++ só ocorre na próxima linha e não na linha em que é feita a atribuição para j
		
		
		System.out.println("Pós-fixado");
		
		System.out.println("y="+y);
		System.out.println("y++="+y++);
		System.out.println("y="+y);
		
		System.out.println("LOOP");
		int l = 1;
		while (l < 3) {			
			System.out.println(l++);
			/*O valor mostrado no console será o estado
			 * anterior da variável i antes de ser
			 * somado +1, somente na próxima linha
			 * de código a ser executada que o valor de i será
			 * mostrado com a incrementação*/
		}
		System.out.println("Valor de l="+l);
	}
}
