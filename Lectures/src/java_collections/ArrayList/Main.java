package java_collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>();

		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");

		System.out.println(days); // [Monday, Tuesday, Wednesday, Thursday, Friday]

		// get
		System.out.println(days.get(0)); // Monday

		// set
		days.set(0, "Sunday");
		System.out.println(days); // [Sunday, Tuesday, Wednesday, Thursday, Friday]

		// remove
//		 days.remove(0);
//		 System.out.println(days); // [Tuesday, Wednesday, Thursday, Friday]

		// size
		System.out.println(days.size()); // 4

		// sort (using Collections util)
		Collections.sort(days);
		System.out.println("sorted: " + days); // sorted: [Friday, Thursday, Tuesday,
//		 Wednesday]

		// clear
//		 days.clear();
//		 System.out.println(days); // []

		displayList(days); // Friday Sunday Thursday Tuesday Wednesday
	}

	static void displayList(ArrayList<String> days) {
		for (int i = 0; i < days.size(); i++) {
			System.out.print(days.get(i) + " ");
		}
	}

}
