package atividadespraticas;

import java.util.Scanner;

public class Atividade1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int num1, num2, i;
		System.out.println("Digite o primeiro número do intervalo");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo");
		num2 = leia.nextInt();
		
		if (num1>num2) {
			System.out.println("O intervalo é inválido!\nFim do programa!");
		} else {
			System.out.printf("No intervalo entre %d e %d: \n", num1, num2);
		
		for (i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5==0) {
				System.out.println(i);
				}
			}
		}
		
		leia.close();
	
	}

}
