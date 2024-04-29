package atividadespraticas;

import java.util.Scanner;

public class Atividade2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String continua = "s";
		int identidadeGenero = 0, pessoaDesenvolvedora = 0, contadorBackend = 0, contadorFrontendMulheres = 0, contadorFrontendHomens = 0, idade;
		int contadorMobileHomensMais40 = 0, contadorMobileMulheresMais40 = 0;
		int contadorFullStackNBMenores30 = 0, totalPessoas = 0, somaIdades = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(!continua.equalsIgnoreCase("n")) {
		
			System.out.println("********************************* Pesquisa ***************************************");
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Selecione sua identidade de gênero:");
		    System.out.println("\n*** 1 - Mulher Cis ***");
		    System.out.println("*** 2 - Homem Cis ***");
		    System.out.println("*** 3 - Não Binário ***");
		    System.out.println("*** 4 - Mulher Trans ***");
		    System.out.println("*** 5 - Homem Trans ***");
		    System.out.println("*** 6 - Outros ***");
		    identidadeGenero = leia.nextInt();
		    leia.nextLine();
		    
			System.out.println("Você é uma pessoa desenvolvedora:");
		    System.out.println("\n*** 1 - Backend ***");
		    System.out.println("*** 2 - Frontend ***");
		    System.out.println("*** 3 - Mobile ***");
		    System.out.println("*** 4 - FullStack ***");
		    pessoaDesenvolvedora = leia.nextInt();
		    leia.nextLine();
		    
			System.out.println("\n******************************************************************************");
			
			switch(pessoaDesenvolvedora) {
			case 1:
				contadorBackend++;
				break;
			case 2:
				if (identidadeGenero == 1 || identidadeGenero == 4) {
                    contadorFrontendMulheres++;
                } else if (identidadeGenero == 2 || identidadeGenero == 5) {
                    contadorFrontendHomens++;
                }
                break;
            case 3:
                if ((identidadeGenero == 2 || identidadeGenero == 5) && idade > 40) {
                    contadorMobileHomensMais40++;
                } else if ((identidadeGenero == 1 || identidadeGenero == 4) && idade > 40) {
                    contadorMobileMulheresMais40++;
                }
                break;
            case 4:
                if (identidadeGenero == 3 && idade < 30) {
                    contadorFullStackNBMenores30++;
                }
                break;
            default:
                break;
        }

	        totalPessoas++;
	        somaIdades += idade;
			
			System.out.println("Deseja continuar? (s) para sim e (n) para não: ");
			continua = leia.nextLine();
	}
			System.out.println("Obrigada por utilizar nosso programa!");
			
			leia.close();

	        System.out.println("Número de pessoas desenvolvedoras Backend: " + contadorBackend);
	        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorFrontendMulheres);
	        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contadorMobileHomensMais40);
	        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + contadorFullStackNBMenores30);
	        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + (somaIdades / totalPessoas));
			

}
		
}


