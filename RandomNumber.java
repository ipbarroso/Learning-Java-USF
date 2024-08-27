package Barroso3and4;

public class RandomNumber {

	public static void main(String[] args) {
		
		// Getting the 2 random numbers
		int number1 = 25 + (int)(Math.random() * 51);
		int number2 = 25 + (int)(Math.random() * 51);
		
		// Printing the 2 random numbers
		System.out.println("Number 1: " + number1 + "\nNumber 2: " + number2);
		
		//Getting the positive difference trough selection
		if (number1 >= number2) {
			System.out.println("The positive difference between the two numbers is: " + (number1-number2));
		}
			else {
				System.out.println("The positive difference between the two numbers is: " + (number2-number1));
			}
		
	}

}
