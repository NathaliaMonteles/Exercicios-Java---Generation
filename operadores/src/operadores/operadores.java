package operadores;

public class operadores {

	public static void main(String[] args) {
		// vamos testar os operadores
		
		//
		int a,b,resultado;
		a=25;
		b=45;
		resultado = a + b;
		
		System.out.println(resultado);

		resultado = b - a;
		
		System.out.println(resultado);
		
		//multiplicação
		
		resultado = a *2;
		System.out.println(resultado);
		
		float resultado2, num1,num2;
		num1 = 25.0f;
		num2 = 45.0f;
		//divisão
		resultado2 = num2/num1;
		
		System.out.println(resultado2);
		
		//modulo
		resultado = 31%2;
		
		System.out.println("O resto da divisão é: " +resultado);
		
		//autoincrement
		int x = 0;
		//x = x +1;
		x++;
		System.out.println(x);
		x++;
		System.out.println("agora x vale: "+x);
		x++;
		
		x+=5;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		x-=1;
		System.out.println(x);
		
		System.out.println("agora vamos calcular: " + (++x));
		
		System.out.println("vamos calcular invertido: " + (x++));
		
		System.out.println(x);
		
		
		//----------------------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------");
		
		int z = 2;
		//z = z *3;
		z *=3;
		System.out.println(z);
		
		//----------------------------------------------------------------------------------------------
		System.out.println("--------------------------------operadores relacionais--------------------");
		
		int n1, n2;
		n1 = 8;
		n2 = 20;
		
		boolean r;
		
		r = n1 > n2 ;
		System.out.println(r);
		
		n1 = 4;
		n2 = 4;
		
		r = n1 < n2;
		System.out.println(r);
		
		r = n1 == n2;
		System.out.println("o n1 é igual a n2?" + r);
		
		r = n1 <= n2;
		
		System.out.println(r);
		
		r = n1 != n2;
		
		System.out.println("comparando se os valores de n1 e n2 são diferentes: "+r);
		
		boolean outraBatata = true;
		System.out.println(!outraBatata);
	}

}
