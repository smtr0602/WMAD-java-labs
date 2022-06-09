import java.util.Scanner;

/**
 * Adding up Integers
 * 
 * Write a program that adds up integers that the user enters. 
 * First the programs asks how many numbers will be added up. 
 * Then the program prompts the user for each number. Finally it prints the sum.
 */
public class Exercise4 {

	public static void main(String[] args) {
		int count;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter how many numbers to add up: ");
		
		count = scanner.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter an integer: ");
			
			int num = scanner.nextInt();
			
			sum += num;
		}
		
		System.out.printf("The sum is: %d", sum);
		
		scanner.close();
	}

}
