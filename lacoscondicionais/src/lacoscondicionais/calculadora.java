package lacoscondicionais;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, opcao, resultado, resto;
		
		System.out.println("Por favor, ó grande usuário, digite o primeiro numero");
		numero1 = leia.nextInt();
		
		System.out.println("Por favor, ó grande usuário, digite o primeiro numero");
		numero2 = leia.nextInt();
		
		System.out.println("Selecione uma opção:");
        System.out.println("*** 1 - Somar os numeros ***");
        System.out.println("*** 2 - Subtrair os numeros ***");
        System.out.println("*** 3 - Multiplicar os numeros ***");
        System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");
		 
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("O resultado da soma é: " + resultado);
			break;
			
		case 2:
			if(numero1 > numero2) {
				resultado = numero1 - numero2;
				System.out.println("O resultado da subtração de R1 - R2 é: " + resultado);
			} else {
				resultado = numero2 - numero1;
				System.out.println("O resultado da subtração de R2 - R1 é: " + resultado);
			}
			break;
			
		case 3:
			resultado = numero1 * numero2;
			if(resultado % 2 == 0) {
				System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero par");
			} else {
				System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero impar");
			}
			
		case 4:
			if(numero2 != 0) {
				resultado = numero1 / numero2;
				resto = numero1 % numero2;
				System.out.println("O resultado da divisão é: " + resultado + " e o resto dessa divisão é: " + resto);
			} else {
				System.out.println("Erro: Divisão por zero ou inválida.");
			}
			
			// ao final do programa, fechar a execução do Scanner, com a linha abaixo
	        leia.close();
			
		}

	}

}
