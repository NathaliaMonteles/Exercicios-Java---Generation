package atividadespraticas;

import java.util.Scanner;

public class Atividade2If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
		 * mostre na tela uma mensagem indicando se este número é par ou ímpar e 
		 * se o número é positivo ou negativo. 
		 */
		
		/*
		 * valor do tipo inteiro***
		 * entrada via teclado***
		 * saida - numero é par ou impar
		 * saida - positivo ou negativo
		 */
		
		int numero;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		int resultado = numero%2;
		
		//validando o numero par ou impar
		if(resultado == 0 ) {
			if(numero>=0) {
				System.out.println(" o número: "+numero+" é par e é positivo");
			} else {
				System.out.println(" o número: "+numero+" é par e é negativo");
			}
		} else {
			if(numero>=0) {
				System.out.println(" o número: "+numero+" é ímpar e é positivo");
			} else {
				System.out.println(" o número: "+numero+" é par e é negativo");
			}
		}

	}

}