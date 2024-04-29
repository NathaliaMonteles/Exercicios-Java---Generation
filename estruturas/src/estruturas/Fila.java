package estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criação de uma fila
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		System.out.println(fila);
		
		fila.add(5);
		fila.add(10);
		fila.add(15);
		fila.add(20);
		
//		System.out.println(fila);
//		
//		System.out.println(fila.peek()); //OLHA
//		System.out.println(fila);
//		
//		System.out.println(fila.poll()); //REMOVE
//		System.out.println(fila);
		
		fila.remove(2); //em caso de urgência
		System.out.println(fila);
		
        Queue<String> nomes = new LinkedList<String>();
        
        nomes.add("Paloma");
        nomes.add("Vinicius");
        nomes.add("Vania");
        nomes.add("Daniel");
        nomes.add("Lucas");
        
        System.out.println(nomes);
	}

}
