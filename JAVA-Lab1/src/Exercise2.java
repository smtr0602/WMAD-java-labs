import java.util.Scanner;

/**
 * Convert Cents to Dollars
 * 
 * Write a program that takes in an input number of cents. The program will
 * write out the number of dollars and cents, like this:
 */
public class Exercise2 {

	public static void main(String[] args) {
		int cents;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter cents: ");
		cents = s.nextInt();
		int convertedDollars = cents / 100;
		int convertedCents = cents % 100;
		System.out.println("The value is " + convertedDollars + " dollars and " + convertedCents + " cents ");

		s.close();
	}

}
