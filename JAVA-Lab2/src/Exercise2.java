import java.util.Scanner;

/**
 * Sum of sequential integers
 * 
 * Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
 */
public class Exercise2 {

	public static void main(String[] args) {
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("The sum of 1 to %d is: %d", n, sum);
		
		scanner.close();
	}

}
