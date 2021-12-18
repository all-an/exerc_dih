package fatorial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0, 
				fatia = 0,
				mussarela = 0, 
				calabresa = 0, 
				portuguesa = 0;
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
					switch(numero) {
					case 1:
						System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
						fatia = scanner.nextInt();
						if(fatia == 1)
							mussarela++;
						else{
							System.out.println("Comeu " + mussarela + calabresa + portuguesa + " fatias.");
							fatia = 0;
							break;
						}		
					case 2:
						System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
						fatia = scanner.nextInt();
						if(fatia == 1)
							calabresa++;
						else{
							System.out.println("Comeu " + mussarela + calabresa + portuguesa + " fatias.");
							fatia = 0;
							break;
						}
					case 3:
						System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
						fatia = scanner.nextInt();
						if(fatia == 1)
							portuguesa++;
						else {
							System.out.println("Comeu " + mussarela + calabresa + portuguesa + " fatias.");
							fatia = 0;
							break;
						}
					case 0:
						loop = false;
						break;
					}
				}
			}catch(Exception e) {
				System.out.println("Desculpe, entrou com dados invalidos.");
			    scanner.next();
			}
		}
		//System.out.println("Fatorial de " + numero + " é = " + fatorial);
	}
}
