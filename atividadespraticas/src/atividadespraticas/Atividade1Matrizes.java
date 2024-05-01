package atividadespraticas;

import java.util.Scanner;

public class Atividade1Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int[][] matrizInteiros = new int[3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                    matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("Matriz:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matrizInteiros[linha][coluna] + " ");
            }
            System.out.println(); 
        }
        
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizInteiros[i][i] + " ");
        }

        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizInteiros[i][2 - i] + " ");
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matrizInteiros[i][i];
        }
        System.out.println("\n\nSoma dos elementos da Diagonal Principal: " + somaDiagonalPrincipal);

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matrizInteiros[i][2 - i];
        }
        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
    }

}
