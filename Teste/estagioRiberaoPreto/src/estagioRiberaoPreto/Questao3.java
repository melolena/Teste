package estagioRiberaoPreto;

public class Questao3 {

	public static void main(String[] args) {
		
		//a = 9
		//b = 128
		//c = 49
		//d= 100
		//e = 13
		//f = Não possui padrão
		
		
		int x;
		System.out.println("letra A:");
		for  (int i = 2; i < 20; i += 2) {
			x = 1;
			x += i;
			
			System.out.print( x + " ");	
		}
		
		System.out.println("\n Letra B:");
		
		for  (int i = 2;i < 500; i *= 2) {
			x = 1;
			x *= i;
			
			System.out.print( x + " ");	
		}
		
		System.out.println("\n Letra C:");
		
		for  (int i = 0; i < 10; i ++) {
			x =  i * i;
			
			System.out.print( x + " ");	
		}
		
		System.out.println("\n Letra D:");
		
		for  (int i = 2; i < 20; i += 2) {
			x =i * i;
			 
			
			System.out.print( x + " ");	
		}
		
		System.out.println("\n Letra E:");

		x = 0;
		int y = 1;
		int numeroSeguinte;
		
		for  (int i = 2; i < 10; i ++) {
			numeroSeguinte = x + y;
			
			System.out.print( numeroSeguinte + " ");
			
			x = y;
			y = numeroSeguinte;
			
		}
		System.out.println("\n Letra F:");
		
		System.out.print("Não possui padrão");

	}

}
