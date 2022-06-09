import java.util.Scanner;

/**
 * Multiplication Table
 * 
 * Write a program that takes a number as input and prints its multiplication
 * table up to 10. Sample Output:
 */
public class Exercise3 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		num = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num * i);
		}

		s.close();

	}

}
