package lacoscondicionais;

public class lacoscondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2;
		
		numero1 = 3;
		numero2 = 5;
		
		if(numero1 > numero2 || numero2 == 5) {
			System.out.println("O numero 1 é maior que o numero 2");
			System.out.println("O numero 2 é igual a 5");
		} else {
			System.out.println("Alguma coisa deu ruim");
		}
		
		if(numero1 < numero2) {
			System.out.println("O numero 1 é maior que o numero 2");
		}
		
		int media = 5;
		
		if (media > 5) {
			System.out.println("Passou diretão");
		} else if (media == 5) {
			System.out.println("Ta de recuperação 1 semana");
		} else if (media == 4) {
			System.out.println("Ta de recuperação 2 semanas");
		} else if (media == 3) {
			System.out.println("Ta de recuperação 3 semanas");
		} else {
			System.out.println("Ta reprovado, faz denovo");
		}
		
		switch(media) {
		case 5:
			System.out.println("Passou direto");
			break;
		case 4:
			System.out.println("Passou raspando");
			break;
		case 3:
			System.out.println("Tá de recuperação");
			break;
		case 2:
			System.out.println("Talvez eu te reprove direto");
			break;
		case 1:
			System.out.println("Ai complica...tem nem o que fazer");
			break;
		default:
			System.out.println("A media tem que ser entre 1 e 5, já te falei isso várias vezes");
			break;
		}
	}
	
		

}
