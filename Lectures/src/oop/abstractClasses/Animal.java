package oop.abstractClasses;

public abstract class Animal {

	private int weight;
	private int age;

	public Animal(int weight, int age) {
		this.weight = weight;
		this.age = age;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getAge() {
		return this.age;
	}

	public abstract void move();
}
