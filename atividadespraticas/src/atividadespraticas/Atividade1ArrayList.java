package atividadespraticas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
		//Mostre na tela todas as cores que foram adicionadas. 
		//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		for(int contador = 0; contador < 5; contador++) {
			System.out.println("Por favor, digite uma cor:");
			cores.add(leia.nextLine());
		}
		
		System.out.println(cores);
		
		cores.sort(null);
		
		System.out.println(cores);
		
		// for each
		for(String cor: cores) {
			System.out.println(cor);
		}
	}

}
