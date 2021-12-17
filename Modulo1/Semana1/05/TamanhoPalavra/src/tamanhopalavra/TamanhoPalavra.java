package tamanhopalavra;

import java.util.Scanner;

public class TamanhoPalavra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Entre uma palavra: ");
		
		int caracteresLetras = 0, outrosCaracteres = 0;
		
		//if(scanner.hasNext()) {
			String entrada = scanner.nextLine();
		    for (int i = 0; i < entrada.length(); i++) {
		    	//totalCaracteres = i;
		        if (!Character.isLetter(entrada.charAt(i))) {
		            outrosCaracteres++;
		        }else {
		        	caracteresLetras++;
		        }
		    }
		//}
		//int letras = totalCaracteres - outrosCaracteres;
		//System.out.println(letras);
		
		System.out.println("O tamanho da palavra é: " + caracteresLetras + " letras.");	
		if(outrosCaracteres > 0) {
			System.out.println("Você digitou também " + outrosCaracteres + " outros caracteres.");
		}
	}
}
