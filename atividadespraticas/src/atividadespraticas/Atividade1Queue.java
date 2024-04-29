package atividadespraticas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a
//		ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//			2: Listar todos os Clientes na fila
//			3: Chamar (retirar) uma pessoa da fila 
//			0: O programa deve ser finalizado. 
//			Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo = 0;
		
		do {
			
			System.out.println("********************************* Menu ***************************************");
	        System.out.println("\n*** 1 - Adicionar Cliente na Fila ***");
	        System.out.println("*** 2 - Listar todos os Clientes ***");
	        System.out.println("*** 3 - Retirar Cliente da Fila ***");
	        System.out.println("*** 0 - Sair ***");
			System.out.println("\n******************************************************************************");
	        
	        System.out.println("Digite a opção desejada: ");
			codigo = leia.nextInt();
			leia.nextLine();
			
			if(codigo == 1) {
				System.out.println("Insira o nome do cliente: ");
				nome = leia.nextLine();
				
				fila.add(nome);
				
			} else if (codigo == 2) {
				System.out.println(fila);
				
			} else if (codigo == 3) {
				fila.poll();
			} else if (codigo == 0) {
				System.out.println("Programa finalizado");
			} else {
				System.out.println("Opção inválida");
			}

		} while (codigo != 0);

	}
		
}
