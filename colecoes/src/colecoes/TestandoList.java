package colecoes;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoList {

	public static void main(String[] args) {
		// utilizando o ArrayList - coleção de dados
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//nomes = "Maria";
		
		nomes.add("Maria"); //indice 0
		nomes.add("Eliana"); //indice 1
		
		System.out.println(nomes);
		
		nomes.add(2, "Ericles"); //(1, "Ericles") > vai ficar no lugar da Eliana e a Eliana agora vai para o 2 indice
		System.out.println(nomes);
		
		System.out.println(nomes.get(2) + "é uma participante da jornada dev java");
		
		nomes.add("Maria");
		
		System.out.println(nomes.indexOf("Maria"));
		System.out.println(nomes);
		
		nomes.set(0,  "Maria Silva");//reescrever
		
		System.out.println(nomes);
		
		nomes.remove(3);//remove o nome
		
		System.out.println(nomes);
		
		System.out.println("o tamanho do objeto é:"+nomes.size());
		
		System.out.println("a lista esta vazia? " + nomes.isEmpty());
		
		System.out.println("Tem Vinicius na lista? " + nomes.contains("Vinicius"));
		
		System.out.println("Tem Eliana na lista? " + nomes.contains("Eliana"));
		
		nomes.sort(null);
		System.out.println(nomes);
		
		nomes.sort(Comparator.reverseOrder());
		
		System.out.println(nomes);
	}

}
