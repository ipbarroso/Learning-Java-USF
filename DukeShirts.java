package Barroso3and4;
import java.util.Scanner;

public class DukeShirts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Calling variables
		double pricePerShirt = 24.95;
		double shipping = 0;
		double originalPrice = 0;
		double extendedPrice = 0;
		double discount = 0;
		double total = 0;
		
		// Asking the user how many shirts he wants
		System.out.println("How many shirts would you like?");
		int shirts = input.nextInt();
		
		// Comparing prices depending on how many shirts the user chose... using selection
		
		// If user picks 1 or 2 shirts this will run 
		if (shirts <= 2 && shirts > 0) {
			shipping = 6.99;
			originalPrice = pricePerShirt * shirts;
			extendedPrice = originalPrice;
			total = extendedPrice + shipping;
		}
		
		// If the user picks 3-6 shirts
		else if (shirts >= 3 && shirts < 7) {
			shipping = 5.49;
			originalPrice = pricePerShirt * shirts;
			discount = originalPrice * 0.10;
			extendedPrice = originalPrice - discount;
			total = extendedPrice + shipping;
		}
		
		// If the user picks 7-9 shirts
		else if(shirts >= 7 && shirts <= 9) {
			shipping = 4.00;
			originalPrice = pricePerShirt * shirts;
			discount = originalPrice * 0.20;
			extendedPrice = originalPrice - discount;
			total = extendedPrice + shipping;
		}
		
		// If user picks 10 or more shirts
		else if (shirts >= 10) {
			shipping = 0;
			originalPrice = pricePerShirt * shirts;
			discount = originalPrice * 0.30;
			extendedPrice = originalPrice - discount;
			total = extendedPrice + shipping;

		}
		
		System.out.printf("The extended price is: $%4.2f \nThe shipping charges were: $%4.2f \nThe total is: $%4.2f", extendedPrice, shipping, total);
		
	}

}
