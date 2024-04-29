package atividadespraticas;

import java.util.Scanner;

public class Arividade2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int numerosPares = 0, numerosImpares = 0, num = 0, contador;
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		
		}
			
			System.out.println("Quantidade de números pares: " + numerosPares);
			System.out.println("Quantidade de números ímpares: " + numerosImpares);
			
			leia.close();
		
	}

}
