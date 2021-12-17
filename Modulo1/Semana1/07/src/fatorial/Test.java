package fatorial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0, mussarela, calabresa, portuguesa;
		boolean loop = true;
		while(loop) {
			try {
				System.out.println("Digite o número do sabor: \n1) Mussarela"
						+ "\n2) Calabresa \n3)Portuguesa \n0) Satisfeito: ");
				numero = scanner.nextInt();
				    
				if (numero < 0 || numero > 3) {
					  System.out.println("Entrada inválida");
				}else
				{
					//for (cont = 1; cont <= numero; cont++)
						//fatorial = fatorial * cont;
					loop = false;
				}
			}catch(Exception e) {
				System.out.println("Desculpe, entrou com dados invalidos.");
			    scanner.next();
			}
		}
		//System.out.println("Fatorial de " + numero + " é = " + fatorial);
	}
}
