package atividadespraticas;

import java.util.Scanner;

public class Atividade2Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float[][] matrizInteiros = new float[10][4];
		double [] notas = new double[10];
		
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("Digite a nota do participante %d no bimestre %d: ", linha + 1, coluna + 1);
                    matrizInteiros[linha][coluna] = leia.nextFloat();
			}
		}
		
        System.out.println("\nMatriz de notas:");
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matrizInteiros[linha][coluna] + "\t");
            }
            System.out.println(); 
        }
		
        for (int linha = 0; linha < 10; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < 4; coluna++) {
            	soma += matrizInteiros[linha][coluna];
            }
            notas[linha] = soma / 4; 
		
        }
        
        System.out.println("Médias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f ", notas[i]);
			
		}
	}
	
}


