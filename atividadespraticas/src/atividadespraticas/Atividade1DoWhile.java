package atividadespraticas;

import java.util.Scanner;

public class Atividade1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int resultado, soma = 0;
		float numero;
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextFloat();
			
			if (numero != 0 && numero > 0) {
				soma += numero;
			}
			
		}while(numero != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
		
		leia.close();
	}

}
