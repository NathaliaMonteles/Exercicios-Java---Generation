package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro {
	
	static Scanner leia = new Scanner(System.in);
	 
	public static void main(String[] args) throws ErroSimples {
		// TODO Auto-generated method stub
		
		int dividendo = 0;
		int divisor = 0;
		boolean funcionando = true;
		
		do {
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();
				
				if(dividendo < divisor) {
					throw new ErroSimples("O primeiro numero tem que ser maior que o segundo");
				}
				
				dividir(dividendo, divisor);
				funcionando = false;
				
			} catch(ArithmeticException e) {
				System.err.println("\n"
						+ "Deu ruim, deu isso aqui: " + e + "\n");
			} catch(InputMismatchException e) {
				System.err.println("Digita um numero né meu bom - " + e);
				leia.nextLine();
			} 	
				finally {
			
				System.out.println("Isso aqui vai rodar sempre");
			}
		} while(funcionando);
		
		
			
		
 
	}
	
	public static void dividir(int dividendo, int divisor) {
		System.out.println("O resultado da divisão é: " + (dividendo/divisor));
	}
	
	
 
}


