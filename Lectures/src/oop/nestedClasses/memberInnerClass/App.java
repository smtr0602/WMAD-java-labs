package oop.nestedClasses.memberInnerClass;

public class App {

	public static void main(String[] args) {
		Door door = new Door();
		door.getLock().getIsLocked();
	}

}
