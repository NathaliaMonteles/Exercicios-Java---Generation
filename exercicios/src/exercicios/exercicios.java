package exercicios;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;
		System.out.printf("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.printf("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.printf("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.printf("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("O média final é: %.1f", mediaFinal);
	}

}
