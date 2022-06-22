package java_collections.CompareTo;

import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	public String printName() {
		return name;
	}

	@Override
	public int compareTo(Names o) {
		return o.name.compareTo(this.name);
	}
}

public class Main {

	public static void main(String[] args) {

		List<Names> countries = new LinkedList<>();

		countries.add(new Names("Canada"));
		countries.add(new Names("Poland"));
		countries.add(new Names("Egypt"));
		countries.add(new Names("Brazil"));
		countries.add(new Names("China"));

		for (Names name : countries) {
			System.out.println(name.printName());
		}

		System.out.println("**************");

		countries.sort(null);
		for (Names name : countries) {
			System.out.println(name.printName());
			// Poland
			// Egypt
			// China
			// Canada
			// Brazil
		}
	}
}