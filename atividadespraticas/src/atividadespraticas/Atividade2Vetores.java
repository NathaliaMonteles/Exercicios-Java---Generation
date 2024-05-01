package atividadespraticas;

import java.util.Scanner;

public class Atividade2Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int[10];
		int contador;
		float media, soma = 0;
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número para a " +contador+ "º posição");
			vetor[contador]= leia.nextInt();
			soma += vetor[contador];
		}
		
		System.out.println("Os elementos do indice que são ímpares: ");
		for(contador = 0; contador < 10; contador++) {
			if (contador % 2 != 0) {
				System.out.println(vetor[contador]);
			}
		}
		
		System.out.println("A quantidade de elementos do vetor que são pares: ");
		for(contador = 0; contador < 10; contador++) {
			if (vetor[contador] % 2 == 0) {
				System.out.println(vetor[contador]);
			}
		}
		
		System.out.println("A soma dos elementos do vetor é: "+soma);
		
		media = soma / contador;
		System.out.print("A média dos elementos é: "+media);
		
		
	}

}
