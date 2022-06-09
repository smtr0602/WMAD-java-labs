import java.util.Scanner;

/**
 * Word Echo
 * 
 * Write a program that asks the user to enter a word. 
 * The program will then repeat the word for as many times as the number of characters.
 */
public class Exercise3 {

	public static void main(String[] args) {
		String word;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		
		word = scanner.nextLine();
		
		int length = word.length();
		
		for(int i = 0; i < length; i++) {
			System.out.printf("%s ", word);			
		}
		
		scanner.close();
	}

}
