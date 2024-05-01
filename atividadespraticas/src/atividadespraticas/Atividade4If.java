package atividadespraticas;

import java.util.Scanner;

public class Atividade4If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String grupo, tipo, alimentacao;
		
		System.out.println("***********************************************************************************");
		
		System.out.println("Selecione o grupo do animal escolhido:");
	    System.out.println("*** 1 - Vertebrado ***");
	    System.out.println("*** 2 - Invertebrado ***");
		grupo = leia.nextLine();

		System.out.println("Selecione o tipo do animal escolhido:");
	    System.out.println("*** 1 - Ave ***");
	    System.out.println("*** 2 - Mamífero ***");
	    System.out.println("*** 3 - Inseto ***");
	    System.out.println("*** 4 - Analídeo ***");
	    tipo = leia.nextLine();
	    
		System.out.println("Selecione a alimentação do animal escolhido:");
	    System.out.println("*** 1 - Carnívoro ***");
	    System.out.println("*** 2 - Onívoro ***");
	    System.out.println("*** 3 - Herbívoro ***");
	    System.out.println("*** 4 - Hematófago ***");
	    alimentacao = leia.nextLine();
	    
	    if (grupo.equals("1") && tipo.equals("1") && alimentacao.equals("1"))
            System.out.println("O animal é uma águia.");
        else if (grupo.equals("1") && tipo.equals("1") && alimentacao.equals("2"))
            System.out.println("O animal é uma pomba.");
        else if (grupo.equals("1") && tipo.equals("2") && alimentacao.equals("2"))
            System.out.println("O animal é um homem.");
        else if (grupo.equals("1") && tipo.equals("2") && alimentacao.equals("3"))
            System.out.println("O animal é uma vaca.");
        else if (grupo.equals("2") && tipo.equals("3") && alimentacao.equals("4"))
            System.out.println("O animal é uma pulga.");
        else if (grupo.equals("2") && tipo.equals("3") && alimentacao.equals("3"))
            System.out.println("O animal é uma lagarta.");
        else if (grupo.equals("2") && tipo.equals("4") && alimentacao.equals("4"))
            System.out.println("O animal é uma sanguessuga.");
        else if (grupo.equals("2") && tipo.equals("4") && alimentacao.equals("2"))
            System.out.println("O animal é uma minhoca.");
        else
            System.out.println("Opção inválida.");
		}
		
	}


