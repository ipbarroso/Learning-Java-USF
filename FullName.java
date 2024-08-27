package Barroso3and4;
import java.util.Scanner;
public class FullName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking the user for their full name
		System.out.println("Enter your first name middle name and surname ");
		
		// Getting the input of the user on the next line so their full name is in a variable 
		String name = input.nextLine();
		
		// Printing the length of the users full name
		System.out.println("Length of your name: " + name.length() + " characters");
		
		// Middle Name
		int m = name.indexOf(" ");
		int m2 = name.lastIndexOf(" ");
		String firstName = name.substring(0, m+1);
		String middleName = name.substring(m+1, m2);
		String lastName = name.substring(m2,name.length());
		System.out.println("Length of your middle name: " + middleName.length() + " characters");
		
		// Initials
		String initials = " " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(1)  ;
		System.out.println("Your initials are:" + initials);
		
		// Printing the user's full name in all capital letters
		System.out.println(name.toUpperCase());
	}

}
