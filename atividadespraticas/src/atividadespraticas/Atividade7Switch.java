package atividadespraticas;

import java.util.Scanner;

public class Atividade7Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float num1, num2, resultado;
		int codigo;
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		num2 = leia.nextFloat();
		
		System.out.println("Selecione o código de operação matemática escolhido:");
        System.out.println("*** 1 - Soma ***");
        System.out.println("*** 2 - Subtração ***");
        System.out.println("*** 3 - Multiplicação ***");
        System.out.println("*** 4 - Divisão ***");
		 
		codigo = leia.nextInt();
		
		switch(codigo) {
		
        case 1:
            resultado = num1 + num2;
            System.out.printf("O número %.2f + %.2f é = %.2f\n", num1, num2, resultado);
            break;

        case 2:
            resultado = num1 - num2;
            System.out.printf("O número %.2f - %.2f é = %.2f\n", num1, num2, resultado);
            break;

        case 3:
            resultado = num1 * num2;
            System.out.printf("O número %.2f * %.2f é = %.2f\n", num1, num2, resultado);
            break;

        case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.printf("O número %.2f / %.2f é = %.2f\n", num1, num2, resultado);
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
            break;
			
		default:
			System.out.printf("Opção inválida");
	}

}
}
