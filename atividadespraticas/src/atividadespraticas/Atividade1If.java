package atividadespraticas;

import java.util.Scanner;

public class Atividade1If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int a,b,c,resultado;
		
		System.out.println("Por favor, digite o primeiro numero");
		a = leia.nextInt();
		
		System.out.println("Por favor, digite o segundo numero");
		b = leia.nextInt();
		
		System.out.println("Por favor, digite o terceiro numero");
		c = leia.nextInt();
		
		resultado = a + b;
		
		if(resultado > c) {
			System.out.println(" A soma de A + B é "+resultado+" e é Maior do que "+c);
			} else if (resultado < c) {
				System.out.println(" A soma de A + B é "+resultado+" e é Menor do que "+c);
			} else {
				System.out.println(" A soma de A + B é "+resultado+" e é Igual a "+c);
			}
		
	}

}
