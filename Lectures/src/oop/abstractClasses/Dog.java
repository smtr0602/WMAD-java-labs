package oop.abstractClasses;

public class Dog extends Animal {

	public Dog(int weight, int age) {
		super(weight, age);
	}

	@Override
	public void move() {
		System.out.println("Running...");
	}

	public void test() {
		System.out.println("test...");
	}
}
