/*Deliverable One for Java Bootcamp Fall 2020
 * Password Checker
 * Tim Stetter
 * 
*/

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {			
		
		//Print password reqs and ask for input		
		System.out.println("The password must contain:");
		System.out.println("At least one lowercase letter");
		System.out.println("At least one uppercase letter");
		System.out.println("At least 7 minimum characters");
		System.out.println("A maximum 12 characters");
		System.out.println("An exclamation point: !");
		System.out.println("Please enter a password:");
		
		//Create string and scanner object to accept input
		String password;
		Scanner scnr = new Scanner(System.in);
		password = scnr.next();
		
		//boolean checks for upper and lower case
		boolean hasUppercase = !password.equals(password.toLowerCase());
		boolean hasLowercase = !password.equals(password.toUpperCase());
		
		//check max length
		
		if (password.length() > 12) {
			System.out.println("Error");		
			
		//check min length	
			
		}else if (password.length() < 7) {
			System.out.println("Error");
						
		//check for ! 	
			
		}else if (!(password.contains("!"))) {
			System.out.println("Error");
			
		//check booleans for case
			
		}else if (!hasUppercase) {
			System.out.println("Error");
		}else if (!hasLowercase) {
			System.out.println("Error");
			
		//valid check print
			
		}else {		
			System.out.println("Password valid and accepted");			
		}
		
		scnr.close();
		
	}
}
