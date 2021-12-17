package fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0, cont, fatorial = 1;
		boolean loop = true;
		while(loop) {
			try {
				System.out.println("Entre um número: ");
				numero = scanner.nextInt();
				    
				if (numero < 0 || numero > 10) {
					  System.out.println("Número tem que ser positivo e menor que 10");
				}else
				{
					for (cont = 1; cont <= numero; cont++)
						fatorial = fatorial * cont;
					loop = false;
				}
			}catch(Exception e) {
				System.out.println("Desculpe, entrou com dados invalidos.");
			    scanner.next();
			}
		}
		System.out.println("Fatorial de " + numero + " é = " + fatorial);
	}
}
