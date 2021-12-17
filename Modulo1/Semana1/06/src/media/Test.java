package media;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean valid = false;
		
		System.out.print("Enter Customer ID: ");
		int custID=0;
		while(!valid) {
		    try {
		        custID = input.nextInt();
		        if(custID >= 1) //we won't hit this step if not valid, but then we check to see if positive
		            valid = true; //yay, both an int, and a positive one too!
		    }
		    catch (InputMismatchException e) {
		        System.out.println("Customer IDs are numbers only");
		        System.out.print("Enter Customer ID: ");
		        input.next(); //clear the input
		    }
		}
	}
}
