package composition;

public class Engine {
	private int capacity;
	
	public Engine() {
		this.capacity = 0;
	}
	
	public Engine(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
}
