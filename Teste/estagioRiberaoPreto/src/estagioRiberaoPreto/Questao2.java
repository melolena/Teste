package estagioRiberaoPreto;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int x = 0;
		int y = 1;
		int numeroSeguinte = x + y;
		
		boolean pertence = false;
		
		System.out.println("Digite o número a ser consultado: ");
		int numeroConsultar = s.nextInt();
		
		
		while(numeroSeguinte <= numeroConsultar) {
			System.out.print(x + " ");
			
			if(numeroSeguinte == numeroConsultar) {
				pertence = true;
				break;
			}
						
			numeroSeguinte =  x + y;
			x = y;
			y = numeroSeguinte;				
		}
		
		if (pertence) {
			System.out.println("\n O número " +numeroConsultar + " pertence a sequência de Fibonacci!");
		}
		else {
			System.out.println("\n O número " +numeroConsultar + " não pertence a sequência de Fibonacci");
		}
		
		
	}

}
