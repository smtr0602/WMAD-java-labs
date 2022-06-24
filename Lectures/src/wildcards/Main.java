package wildcards;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

		printList(list1);
		printList(list2);

	}

	// Method1: by using Wildcard
	public static void printList(List<?> list) {
		System.out.println(list);
	}

	// Method2: by using Generics instead
	//
	//	public static <T extends Number> void printList(List<T> list) {
	//		System.out.println(list);
	//	}
}
