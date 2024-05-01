package atividadespraticas;

import java.util.Scanner;

public class Atividade2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int quantidadeMultiplosDeTres = 0;
		float numero, soma = 0;
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextFloat();
			
			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				quantidadeMultiplosDeTres++;
			}
		} while(numero != 0);
	
			if (quantidadeMultiplosDeTres > 0) {
				float media = soma / quantidadeMultiplosDeTres;
				System.out.println("A média dos números múltiplos de 3 digitados é: " +media);
			} else {
				System.out.println("Nenhum número múltiplo de 3 foi digitado.");
			}
		
		leia.close();
	}
		

}
