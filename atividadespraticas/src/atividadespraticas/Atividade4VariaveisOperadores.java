package atividadespraticas;

import java.util.Scanner;

public class Atividade4VariaveisOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float num1, num2, num3, num4;
		System.out.printf("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.printf("Digite o segundo número: ");
		num2 = leia.nextFloat();
		System.out.printf("Digite o terceiro número: ");
		num3 = leia.nextFloat();
		System.out.printf("Digite o quarto número: ");
		num4 = leia.nextFloat();
		
		float diferenca = ((num1 * num2) - (num3 * num4));
		
		System.out.printf("A diferença do produto entre o num1 e num2 pelo produto entre o num3 e o num4 é: %.2f", diferenca);
	}

}
