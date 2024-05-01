package atividadespraticas;

import java.util.Scanner;

public class Atividade8Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float saldoAtual = 1000, saque, novoSaldo, deposito;
		int codigo;
		
		System.out.println("Selecione o tipo de operação:");
        System.out.println("*** 1 - Saldo ***");
        System.out.println("*** 2 - Saque ***");
        System.out.println("*** 3 - Depósito ***");
		 
		codigo = leia.nextInt();
		
		switch(codigo) {
		
        case 1:
            System.out.printf("O seu saldo é de %.2f\n", saldoAtual);
            break;
            
        case 2:
        	System.out.printf("Digite o valor desejado para saque: ");
        	saque = leia.nextFloat();
        	
            if (saldoAtual > saque) {
                novoSaldo = saldoAtual - saque;
                System.out.printf("Seu novo saldo é de = %.2f\n", novoSaldo);
            } else {
                System.out.println("Saldo insuficiente!");
            }
            break;
            
        case 3:
            System.out.printf("Digite o valor de depósito: ");
            break;
	}

}
}
