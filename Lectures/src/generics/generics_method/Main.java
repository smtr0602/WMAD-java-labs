package generics.generics_method;

public class Main {

	public static void main(String[] args) {

		DemoClass demoObj = new DemoClass();

		System.out.println(demoObj.getType(3));
		System.out.println(demoObj.getType("myStr"));
	}

}

class DemoClass {

	public <T> T getType(T data) {
		return data;
	}
}