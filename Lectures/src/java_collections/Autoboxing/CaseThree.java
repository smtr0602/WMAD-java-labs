package java_collections.Autoboxing;

import java.util.ArrayList;

public class CaseThree {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		int num = 5;
		arrayList.add(num);

		System.out.println(arrayList); // [5]
	}
}