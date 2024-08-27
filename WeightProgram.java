//2549153
package Barroso1and2;

import java.util.Scanner;

public class WeightProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Asking weight in kilos
		System.out.println("What's your weight in kilos? ");
		//Retrieving the input info and adding the value to the variable weight 
		double weight = input.nextDouble();
		//calculations to get the person's weight after the conversion
		double conversion = weight * 2.204;
		//Printing the result 
		System.out.println("Your weight in pounds is " + conversion + " pounds");
	}

}
