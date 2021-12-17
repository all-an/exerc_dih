package naoseivirgula;

import java.util.Scanner;

public class NaoSeiVirgula {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		
		String string = entrada.nextLine();
		
		string = string.replace(',', '.');
		
		double numero = Double.parseDouble(string);
		
		System.out.print("Em inteiro: " + (int)numero);
	}
}
