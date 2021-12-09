package tipoassim;

import java.util.Scanner;

public class TipoAssim {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		while(!sair) {
			try {
				System.out.println("1 Números Inteiros (tipo int)\n2 Números Reais (tipo double)\n"
						+ "3 Caracteres (tipo char)\n4 Booleano (tipo boolean)");
				System.out.println("Exemplo, digite 1 para ver sobre inteiros."
						+ "\nEscolha o tipo para ver a descrição:");
				System.out.println("Digite 5 para sair.");
				int escolha = sc.nextInt();
				switch(escolha){
					case 1:
						sair = true;
						System.out.println("Tipo int : Qualquer número inteiro, seja ele negativo, nulo ou positivo.");
						break;
					case 2:
						sair = true;
						System.out.println("Tipo double : Qualquer número real, seja ele negativo, nulo ou positivo. ");
						break;
					case 3:
						sair = true;
						System.out.println("Tipo char : Qualquer caractere alfanumérico. ");
						break;
					case 4:
						sair = true;
						System.out.println("Tipo boolean : Conjunto de valores lógicos falso ou verdadeiro. ");
						break;
					case 5:
						sair = true;
						System.out.println("Saiu ");
						break;
				}
			}
			catch(Exception e){
				System.out.println("Engraçadinho você, favor digitar um número!");
	            sc.next();
			}
		}
	}

}
