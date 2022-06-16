package oop.interfaces;

import oop.abstractClasses.Bird;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int weight, int age) {
		super(weight, age);
	}

	@Override
	public void Fly() {
		System.out.println("Sparrow is Flying...");
	}
}
