package ultimaaula;

import java.util.Arrays;
import java.util.List;

public class lambida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//		System.out.println(numeros);
//		
//		for(Integer numero : numeros) {
//			System.out.println(numero);
//		}
//		
//		numeros.forEach(numero -> System.out.println(numero + numero));

		for(Integer numero : numeros) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		}
		
		numeros.forEach(numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		});
	}

}
