package composition;

public class Car {
	public Engine engine;
	public Doors doors;
	public Tires tires;
	
	public Car(int noOfEngine, int noOfDoors, int noOfTires) {
		this.engine = new Engine(noOfEngine);
		this.doors = new Doors(noOfDoors);
		this.tires = new Tires(noOfTires);
	}
}
