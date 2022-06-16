package oop.composition;

public class App {
	public static void main(String[] args) {
		Car car = new Car(1600, 4, 4);
		System.out.println(car.engine.getCapacity());
		System.out.println(car.doors.getNoOfDoors());
		System.out.println(car.tires.getNoOfTires());
	}

}
