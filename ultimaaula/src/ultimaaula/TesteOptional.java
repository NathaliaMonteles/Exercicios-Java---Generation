package ultimaaula;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Optional<String> opcional = Optional.empty();
//		Optional<String> opcional2 = Optional.of("Thiago");
//		Optional<String> opcional3 = Optional.ofNullable(null);
//		
//		System.out.println(opcional);
//		System.out.println(opcional2.isPresent());
//		System.out.println(opcional3.orElse("oi"));
		
		String[] palavras = new String[10];
		
		Optional<String> seila = Optional.ofNullable(palavras[2]);
		
		System.out.println(seila.orElse("Ta vazio, pode colocar um nome novo"));
		
		palavras[7] = "Vania";
		
		if(palavras[2] == null) {
			System.out.println("Ta vazio, pode colocar um nome novo");
		} else {
			System.out.println(palavras[2]);
		}
		
	}

}
