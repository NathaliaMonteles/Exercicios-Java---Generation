package estruturas;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando uma pilha
		
		Stack<String> nomes = new Stack<String>();
		
		System.out.println(nomes);
		
		nomes.push("Paloma");
		nomes.push("Vinicius");
		nomes.push("Vania");
		nomes.push("Daniel");
		nomes.push("Lucas");
		
		System.out.println(nomes.peek());
		System.out.println(nomes);
		
		System.out.println(nomes.pop());
		nomes.remove(2);
		System.out.println(nomes);
	}

}
