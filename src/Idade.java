
public class Idade {

	public static void main(String[] args) {
		int idade = 15, resultado1, resultado2;
		
		resultado1 = (idade + 5) * 2;
		resultado2 = resultado1 - 5;
		
		System.out.println("A idade é:" + idade);
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2:" + resultado2);
		
		if(resultado2 > 20) {
			System.out.println("A idade é maior que 20");
		}
		else {
			System.out.println("A idade é menor que 20");
		}
		
		
		

	}

}
