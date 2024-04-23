package lacosrepeticao;

import java.util.Scanner;

public class TestandoWhile2 {

	public static void main(String[] args) {
		// While com saída definida pelo usuário
		
		String continua = "s";
		int numero1, numero2, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		/*while(!continua.equals("n")) {
			//equals == metodo que compara variavel com algo esperado
			
			System.out.println("valor do continua é:" + continua);
			System.out.println("Deseja conitnuar? (s) para sim e (n) para não: ");
			continua = leia.nextLine();
	}*/
		
		while(!continua.equalsIgnoreCase("n")) {
			//equals == metodo que compara variavel com algo esperado
			
			System.out.println("Digite o primeiro numero: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			numero2 = leia.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado é: "+ resultado);
			leia.nextLine();
			
			System.out.println("Deseja continuar? (s) para sim e (n) para não: ");
			continua = leia.nextLine();
	}
		System.out.println("Obrigada por utilizar nosso programa!");
}
}

