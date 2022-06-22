package java_collections.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();

		countries.add("Canada");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Brazil");
		countries.add("China");

		new Main().printList(countries);

		Random rand = new Random();

		int indexVal = rand.nextInt(5); //formula: rand.nextInt(max-min) + min
		System.out.println(countries.get(indexVal));

	}

	public void printList(List<String> list) {

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
			// Element: Canada
			// Element: Poland
			// Element: Egypt
			// Element: Brazil
			// Element: China
		}
	}
}