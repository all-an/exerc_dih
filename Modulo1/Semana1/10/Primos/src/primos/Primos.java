package primos;

import  java.util.Scanner;

public class Primos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    		
    	int numero;
    		
    	System.out.print("Digite um numero: ");
    	numero = sc.nextInt();
    		
    	int cont = 0;
    	for(int i = 1; i <= numero; i++) {
    		if(numero % i == 0) { //testando divisibilidade de todos os números antes da entrada
    			cont++; //se divisível por i some aqui em cont
    		}
    	}
    		
    	if(cont == 2) {
    		System.out.println("É Primo");
    	} else {
    		System.out.println("Não é primo");
    	}
        
    }
}