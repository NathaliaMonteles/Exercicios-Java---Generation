package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
							+ "***************************************************");
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nBanco do Brasil - O futuro começa aqui");
				sobre();
		leia.close();
				System.exit(0);
				
				switch(opcao) {
				case 1 :
					System.out.println("Cria conta\n");
					break;
					
				case 2 :
					System.out.println("Listar todas as contas");
					break;
				
				case 3 :
					System.out.println("Consultar dados da conta - por número\n");
					break;
					
				case 4 :
					System.out.println("Atualizar dados da conta\n");
					break;
					
				case 5 :
					System.out.println("Apagar conta\n");
					break;
					
				case 6 :
					System.out.println("Saque\n");
					break;
					
				case 7 :
					System.out.println("Depósito\n");
					break;
					
				case 8 :
					System.out.println("Transferência\n");
					break;
					
				case 9 :
					System.out.println("\nOpção Inválida\n");
					break;
				
				}
			}
			
		}

	}
			public static void sobre() {
				System.out.println("*****************************************************");
				System.out.println("Projeto Desenvolvido por: ");
				System.out.println("Generation Brasil - generation@generation.org");
				System.out.println("github.com/conteudoGeneration");
				System.out.println("*********************************************************");
			}

}
