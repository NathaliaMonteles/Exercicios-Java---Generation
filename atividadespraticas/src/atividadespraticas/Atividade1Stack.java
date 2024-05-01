package atividadespraticas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade1Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String nomeLivro;
		int codigo;
		
		Set<String> setLivros = new HashSet<String>();
		
		do {
			
			System.out.println("*******************************************************************************");
	        System.out.println("\n*** 1 - Adicionar Livro na pilha ***");
	        System.out.println("*** 2 - Listar todos os Livros ***");
	        System.out.println("*** 3 - Retirar Livro na pilha ***");
	        System.out.println("*** 0 - Sair ***");
			System.out.println("\n******************************************************************************");
			
	        System.out.println("Digite a opção desejada: ");
			codigo = leia.nextInt();
			leia.nextLine();
			
			if(codigo == 1) {
				System.out.println("Escreva o nome do livro que deseja adicionar na pilha: ");
				nomeLivro = leia.nextLine();
				
				setLivros.add(nomeLivro);
				
			} else if (codigo == 2) {
				System.out.println("Os livros inseridos na lista são: "+setLivros);
				
			} else if (codigo == 3) {
                if (setLivros.isEmpty()) {
                    System.out.println("A pilha de livros está vazia!");
                } else {
   				System.out.println("Digite o nome do livro que deseja remover da lista: ");
                nomeLivro = leia.nextLine();

                if (setLivros.remove(nomeLivro)) {
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro não encontrado na lista.");
                }
                
              }
				
			} else if (codigo == 0) {
				System.out.println("Programa finalizado");
			} else {
				System.out.println("Opção inválida");
			}

		} while (codigo != 0);
	}

}
