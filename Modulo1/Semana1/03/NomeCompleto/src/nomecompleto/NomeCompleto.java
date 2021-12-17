package nomecompleto;

import java.util.Scanner;

public class NomeCompleto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
	    System.out.println("Entre segundo nome: ");
	    String segundoNome = entrada.nextLine(); 
	    System.out.println("Entre primeiro nome: ");
	    String primeiroNome = entrada.nextLine(); 
	    System.out.println("Nome : " + primeiroNome + " " + segundoNome);  
	}
}
