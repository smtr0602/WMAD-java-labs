package oop.abstractClasses;

public class Bird extends Animal {

	public Bird(int weight, int age) {
		super(weight, age);
	}

	@Override
	public void move() {
		System.out.println("Flying..");
	}

}
