

/**
 * Print the Pattern
 * 
 * Write a program to display the following pattern.
 * 
 *    J    a   v     v  a
 *    J   a a   v   v  a a
 * J  J  aaaaa   V V  aaaaa
 *  JJ  a     a   V  a     a
 *  
 */
public class Exercise4 {

	public static void main(String[] args) {
		System.out.printf("%4s%5s%4s%6s%3s%n", "j", "a", "v", "v", "a");
		System.out.printf("%4s%4s%2s%4s%4s%3s%2s%n", "j", "a", "a", "v", "v", "a", "a");
		System.out.printf("%1s%3s%7s%4s%2s%7s%n", "j", "j", "aaaaa", "v", "v", "aaaaa");
		System.out.printf("%3s%3s%6s%4s%3s%6s%n", "jj", "a", "a", "v", "a", "a");
	}

}