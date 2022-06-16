package oop.nestedClasses.anonymousInnerClass;

public class App {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door.getLock().isLocked("abc123"));

	}

}
