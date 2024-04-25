package atividadespraticas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade1Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
//		O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e 
//		adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//		Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 

		Set<String> setValores = new HashSet<String>();
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Por favor, digite um valor:");
			setValores.add(leia.nextLine());
			
			System.out.println("\nDados da Collection: " + setValores);
		}
		
		System.out.println("\n\nListar todos os valores com o Iterator");
		
		Iterator<String> isetValores = setValores.iterator();
		
		while (isetValores.hasNext()) {
			System.out.println(isetValores.next());
		}
		
		
		
	}

}
