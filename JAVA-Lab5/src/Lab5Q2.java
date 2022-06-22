import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q2 {

	/**
	 * Create an ArrayList of Integers
	 * Fill the ArrayList with ten random numbers (1-50)
	 * Copy each value from the ArrayList into another ArrayList of the same capacity
	 * Change the last value in the first (original) ArrayList to a -5
	 * Display the contents of both ArrayLists
	 */
	public static void main(String[] args) throws Exception {

		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int n = rand.nextInt(50) + 1;
			nums.add(n);
		}

		ArrayList<Integer> copied = new ArrayList<>(nums);

		nums.set(nums.size() - 1, -5);

		System.out.println("Original ArrayList with modified values: " + nums);
		System.out.println("Copied ArrayList with original values: " + copied);

		scanner.close();
	}
}
