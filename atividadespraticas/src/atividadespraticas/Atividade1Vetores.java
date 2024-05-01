package atividadespraticas;

import java.util.Scanner;

public class Atividade1Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int vetor [] = {5, 10, 12, 3, 7, 24, 19, 33, 50, 1};
		int numero, posicao = -1;
		String continua = "s";
		
		while (continua.equalsIgnoreCase("s")) {
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			} 
		}
			
			if (posicao != -1) {
				System.out.println("O número " + numero + " está na posição " + posicao);
			}
			else {
				System.out.println("O número " + numero + " não foi encontado.");
			}
			
			posicao = -1;
			
            System.out.println("Deseja continuar? (s/n)");
            continua = leia.next();
        }

        leia.close();
    }

}
