package atividadespraticas;

import java.util.Scanner;

public class Atividade3If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int idade;
		boolean opcao;
		String nomeDoador;
		
		System.out.println("Insira seu nome:");
		nomeDoador = leia.next();
		
		System.out.println("Insira sua idade:");
		idade = leia.nextInt();
		
		System.out.println("É a sua primeira doação? (True para sim e false para não):");
		opcao = leia.nextBoolean();
		
		if(idade > 18 && idade <= 60) {
			System.out.println(nomeDoador+" está apto para doar sangue!");
		} else if(opcao && idade >= 60 && idade <= 69) {
			System.out.println(nomeDoador+" está apto para doar sangue!");
		} else {
			System.out.println(nomeDoador + " não está apto para doar sangue.");
		}
	}
}

