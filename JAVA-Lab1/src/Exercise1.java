import java.util.Scanner;

/**
 * Find the Area of a Circle
 * 
 * Write a program that calculates the area of a circle from its radius. The
 * radius should be read as an integer from the keyboard.
 */
public class Exercise1 {

	public static void main(String[] args) {
		double radius;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = s.nextInt();
		double area = Math.PI * Math.pow(radius, 2);
		System.out.printf("The area is: %f", area);

		s.close();
	}

}
