package generics.bounded_types;

public class Main {

	public static void main(String[] args) {
		GenericsClass<Integer> myObj = new GenericsClass<>(5);
		GenericsClass<Double> myObj2 = new GenericsClass<>(6.4);
		// GenericsClass<Double> myObj3 = new GenericsClass<>("myStr"); // Compile error

		System.out.println(myObj.getNum());
		System.out.println(myObj2.getNum());
		// System.out.println(myObj3.getNum());
	}
}

class GenericsClass<T extends Number> {

	private T num;

	public GenericsClass(T num) {
		this.num = num;
	}

	public T getNum() {
		return this.num;
	}
}