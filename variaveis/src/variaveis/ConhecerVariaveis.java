package variaveis;

public class ConhecerVariaveis {

	public static void main(String[] args) {
		// variáveis Java
		
		/*
		 * quando vc tiver um comentário 
		 * muito longo
		 * de várias linhas
		 */
		
		int numero;
		
		numero = 10;
		
		int x = 20;
		
		System.out.println("O número é: " + numero);

		byte bit;
		short valor;
		int quantidade;
		long identificador;
		float altura; 
		double area;
		char tipo;
		boolean resposta;
		
		int valor2;
		
		final int ALTURA = 180;
		
		int BATATAFRITA = 45;
		
		BATATAFRITA = 150;
		
		//ALTURA = 150;
		
		System.out.println(BATATAFRITA);
		
		String nome = "Giovana";
		
		System.out.println(nome + " é uma pessoa legal e tem : " + ALTURA +" de altura.");
		
		System.out.println(BATATAFRITA + " " + ALTURA);
		
		System.out.print("Bernardo\n");
		System.out.print("Bern\nardo");
		System.out.println("\nEliana");
		System.out.print("\tBernardo\n");
		System.out.println("Contrary to \"popular\" belief, Lorem Ipsum is not simply random text. \n"
				+ "It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. "
				+ "Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, "
				+ "from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. "
				+ "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. "
				+ "This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
	
		System.out.printf("A %s participa do bootcamp da Generation. %d\n" ,nome,BATATAFRITA);
		
		float numero2 = 153.9978546211f;
		
		System.out.printf("%.3f",numero2);
	}

}
