package oop.abstractClasses;

public class App {

	public static void main(String[] args) {
		Bird bird = new Bird(1, 3);
		Dog dog = new Dog(9, 7);

		bird.move();
		dog.move();
	}

}
