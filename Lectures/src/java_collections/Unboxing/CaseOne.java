package java_collections.Unboxing;

public class CaseOne {

	public static void myMethod(int num) {
		System.out.println(num); // 100
	}

	public static void main(String[] args) {

		Integer intObject = 100;
		myMethod(intObject);
	}
}