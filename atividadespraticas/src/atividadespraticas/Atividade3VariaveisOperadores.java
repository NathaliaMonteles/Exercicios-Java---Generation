package atividadespraticas;

import java.util.Scanner;

public class Atividade3VariaveisOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float salario, adicionalNoturno, horasExtras, descontos;
		System.out.printf("Digite o salário bruto: ");
		salario = leia.nextFloat();
		System.out.printf("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.printf("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.printf("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		float novoSalario = salario + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O novo salário é: %.2f", novoSalario);
		
	}

}
