package Animals;

public class Animal {
	private int height;
	private int weight;
	private String bloodType;
	
	public Animal() {
		this.height = 100;
		this.weight = 20;
		this.bloodType = "O";
	}
	
	public Animal(int height, int weight, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getBloodType() {
		return this.bloodType;
	}
}
