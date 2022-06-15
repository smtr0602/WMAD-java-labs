package composition;

public class Doors {
	private int noOfDoors;
	
	public Doors() {
		this.noOfDoors = 0;
	}
	
	public Doors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public int getNoOfDoors() {
		return this.noOfDoors;
	}
}
