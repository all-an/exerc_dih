package test;

import java.util.Scanner;

public class Rodizio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolhePizza = 0, fatias = 0,sabor = 0; 
		boolean satisfeitoPizzas = false, satisfeitoFatias = false;
		
		while(!satisfeitoPizzas) {
			System.out.println("Digite o número do sabor: \n1) Mussarela"
					+ "\n2) Calabresa \n3)Portuguesa \n0) Satisfeito: ");
			escolhePizza = scanner.nextInt();
			if(escolhePizza == 1) {
				while(!satisfeitoFatias) {
					System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
					sabor = scanner.nextInt();
					if(sabor == 1)
						fatias++;
					else {
						System.out.println("Comeu " + fatias + " fatia(s) de mussarela.");
						satisfeitoFatias = true;
						satisfeitoPizzas = true;
					}				
				}
			}
			else if(escolhePizza == 2) {
				while(!satisfeitoFatias) {
					System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
					sabor = scanner.nextInt();
					if(sabor == 1)
						fatias++;
					else{
						System.out.println("Comeu " + fatias + " fatia(s) de calabresa.");
						satisfeitoFatias = true;
						satisfeitoPizzas = true;
					}		
				}
			}
			else if(escolhePizza == 3) {
				while(!satisfeitoFatias) {
					System.out.println("Quer uma fatia: digite 1 , não quer: digite 2 ");
					sabor = scanner.nextInt();
					if(sabor == 1)
						fatias++;
					else{
						System.out.println("Comeu " + fatias + " fatia(s) de portuguesa.");
						satisfeitoFatias = true;
						satisfeitoPizzas = true;
					}		
				}
			}
			else {
				System.out.println("Obrigado");
			}	
		}	
	}
}
