package atividadespraticas;

import java.util.Scanner;

public class Atividade5Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float quantidade, valorTotal;
		int codigo;
		
		System.out.println("Selecione a opção correspondente a seu pedido:");
        System.out.println("*** 1 - Cachorro Quente ***");
        System.out.println("*** 2 - X-Salada ***");
        System.out.println("*** 3 - X-Bacon ***");
        System.out.println("*** 4 - Bauru ***");
        System.out.println("*** 5 - Refrigerante ***");
        System.out.println("*** 6 - Suco de laranja ***");
		 
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 10;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
		case 2:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 15;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
		case 3:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 18;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
		case 4:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 12;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
		case 5:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 8;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
		case 6:
			System.out.println("Digite a quantidade comprada: ");
			quantidade = leia.nextFloat();
			
			valorTotal = quantidade * 13;
			System.out.printf("O valor total da sua conta é de R$");
			System.out.printf("%.2f", valorTotal);
			break;
			
        default:
            System.out.println("Opção inválida!");
			
		}
		
        leia.close();

	}

}
