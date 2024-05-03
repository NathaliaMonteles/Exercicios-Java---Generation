package polimorfismo;

public class Main {
	
	public static void main(String[]arg) {
		
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		animal.fazerSom();
		cachorro.fazerSom();
		gato.fazerSom();
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.soma(2, 3));
		System.out.println(calculadora.soma(2, 3, 3.7));
	}

}
