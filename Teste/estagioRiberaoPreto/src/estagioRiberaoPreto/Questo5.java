package estagioRiberaoPreto;
import java.util.Scanner;

public class Questo5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		
		String palavra = s.next();
		String novaPalavra = "";
		
		for(int i = palavra.length() -1;i >= 0; i--) {
			novaPalavra += palavra.charAt(i);
		}
		
		System.out.println("A palavra original é: " + palavra); 
		System.out.println("A palavr invertida é: " + novaPalavra); 

	}

}
