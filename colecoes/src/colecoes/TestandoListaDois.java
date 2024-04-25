package colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestandoListaDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//nomes = "Maria";
		
		nomes.add("Maria"); //indice 0
		nomes.add("Eliana"); //indice 1
		
		//for( inicio; condição; contador)
		//for( var : lista)
		
		for(String memes : nomes) {
			System.out.println(memes + "é uma pessoa participante da jornada da Generation");
		}
		
		Iterator <String> iNomes = nomes.iterator();
		
		while(iNomes.hasNext()) {
			System.out.println(iNomes.next());
			
		}
		
	}

}
