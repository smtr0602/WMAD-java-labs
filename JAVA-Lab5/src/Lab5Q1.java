import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {

	/**
	 * Create an ArrayList of Integers.
	 * Fill each of the 10 slots with a random value from 1-50.
	 * Display those values on the screen, and then prompt the user for an integer.
	 * Search through the ArrayList, and if the item is present, print a message that the number is in the list.
	 * If the value is not in the ArrayList, print a message that the number is not in the list.
	 */
	public static void main(String[] args) throws Exception {

		ArrayList<Integer> nums = new ArrayList<>();
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int n = rand.nextInt(50) + 1;
			nums.add(n);
		}
		System.out.println("The values are: " + nums);
		System.out.println("Enter a number between 1 - 50:");

		boolean isValid = false;

		while (!isValid) {
			try {
				int input = scanner.nextInt();
				if (nums.contains(input)) {
					System.out.println("The number is in the list!");
				} else {
					System.out.println("The number is NOT in the list..");
				}
				isValid = true;
				scanner.close();

			} catch (InputMismatchException e) {
				System.out.println("Please enter a number!");
				scanner.next();
			}
		}
	}
}
