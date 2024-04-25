package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestandoSet {

	public static void main(String[] args) {
		// utilizando o set para coleções de dados
		
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Luana");
		nomes.add("Ellen");
		nomes.add("Luana");
		
		System.out.println(nomes);
		nomes.add("Carol");
		nomes.add("Ana");
		nomes.remove("Ellen");
		System.out.println(nomes);
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.contains("Gustavo"));
		
		System.out.println(nomes.hashCode());//exibe o HashCode do objeto nomes
		
		for(String festa : nomes) {
			System.out.println(festa);
		}

	}

}
