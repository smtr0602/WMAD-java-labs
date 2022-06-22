package java_collections.LinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> linky = new LinkedList<>();
		linky.add(1);
		linky.add(2);
		linky.add(3);
		linky.add(4);

		System.out.println(linky); // [1, 2, 3, 4]

		linky.add(1, 5);
		System.out.println(linky); // [1, 5, 2, 3, 4]

		linky.remove(0);
		System.out.println(linky); // [5, 2, 3, 4]
	}
}