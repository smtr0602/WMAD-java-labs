package polymorphism.shapes;

public class App {

	public static void main(String[] args) {
		Shape rectabgle = new Rectangle(20, 35);
		Shape circle = new Circle(3);
		
		System.out.println(rectabgle.getArea());
		System.out.println(circle.getArea());

	}

}
