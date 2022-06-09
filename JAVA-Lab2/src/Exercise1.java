
import java.util.Scanner;

/**
 * Run of Integers
 * 
 * Write a program that asks the user for a starting value and an ending value 
 * and then writes all the integers (inclusive) between those two values.
 */
public class Exercise1 {

	public static void main(String[] args) {
		int start;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter starting value: ");
		
		start = scanner.nextInt();
		
		System.out.print("Enter ending value: ");
		
		int end = scanner.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}

}
