package media;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		double notas = 0, cont = 0;	
		while(cont < 3) {
			try {
				System.out.print("Entre com uma nota: ");
		    	notas += scanner.nextDouble();
			}catch(Exception e) {
				System.out.println("Desculpe, entrou com dados invalidos.");
		    	scanner.next();
		    	cont--;
		    }
			cont++;
		}
		double media = notas / cont;
		System.out.println("\nA média é " + String.format("%,.2f", media));
	}
}
