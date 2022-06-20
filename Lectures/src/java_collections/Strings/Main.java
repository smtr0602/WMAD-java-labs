package java_collections.Strings;

public class Main {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";
		String z1 = x + y;
		String z2 = x.concat(y);

		System.out.println(z1 == "HelloWorld"); // false
		System.out.println(z2 == "HelloWorld"); // false

		System.out.println(z1.equals("HelloWorld")); // true
		System.out.println(z2.equals("HelloWorld")); // true

	}

}
