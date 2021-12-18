package tamanhonome;

import java.util.Scanner;

public class TamanhoNome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre uma palavra: ");

		int caracteresLetras = 0, outrosCaracteres = 0;

		String entrada = scanner.nextLine();
		for (int i = 0; i < entrada.length(); i++) {
			
			if (!Character.isLetter(entrada.charAt(i))) {
				outrosCaracteres++;
			} else {
				caracteresLetras++;
			}
		}
		System.out.println("O tamanho da palavra é: " + caracteresLetras + " letras.");
		if (outrosCaracteres > 0) {
			System.out.println("Você digitou também " + outrosCaracteres + " outros caracteres.");
		}
	}
}
