package generics.generics_class;

public class Main {

	public static void main(String[] args) {
		GenericsClass<Integer> intObj = new GenericsClass<>(6);
		System.out.println(intObj.getData());

		GenericsClass<String> strObj = new GenericsClass<>("myStr");
		System.out.println(strObj.getData());
	}

}

class GenericsClass<T> {
	private T data;

	public GenericsClass(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

}