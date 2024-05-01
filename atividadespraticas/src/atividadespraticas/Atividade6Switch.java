package atividadespraticas;

import java.util.Scanner;

public class Atividade6Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float salario, novoSalario;
		int codigo;
		String nome;
		
		System.out.println("Digite o seu nome do colaborador:");
		nome = leia.nextLine();
		
		System.out.println("Selecione o seu cargo:");
        System.out.println("*** 1 - Gerente ***");
        System.out.println("*** 2 - Vendedor ***");
        System.out.println("*** 3 - Supervisor ***");
        System.out.println("*** 4 - Motorista ***");
        System.out.println("*** 5 - Estoquista ***");
        System.out.println("*** 6 - Técnico de TI ***");
		 
		codigo = leia.nextInt();
		
		System.out.printf("Digite o salário do colaborador %s: ", nome);
		salario = leia.nextFloat();
		
		switch(codigo) {
		
		case 1:
			novoSalario = salario + (0.10f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
			
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
			
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
			
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
			
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.printf("O novo salário do(a) "+nome+" é de: "+novoSalario);
			break;
	}

}
	
}
