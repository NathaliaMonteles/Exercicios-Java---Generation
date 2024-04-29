package atividadespraticas;

import java.util.Scanner;

public class Atividade1VariaveisOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float salario;
		System.out.printf("Digite seu salário: ");
		salario = leia.nextFloat();
		
		float novoSalario = salario + 1000;
		
		System.out.printf("O novo salário é: %.2f", novoSalario);

	}

}
