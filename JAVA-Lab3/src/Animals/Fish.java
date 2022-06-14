package Animals;

public class Fish extends Animal {
	private String size;
	private boolean livesInOcean;
	private boolean isEdible;
	
	public Fish() {
		super();
		
		this.size = "sm";
		this.livesInOcean = false;
		this.isEdible = false;
	}
	
	public Fish(String size, boolean livesInOcean, boolean isEdible) {
		super();
		
		this.size = size;
		this.livesInOcean = livesInOcean;
		this.isEdible = isEdible;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public boolean getLivesInOcean() {
		return this.livesInOcean;
	}
	
	public boolean getIsEdible() {
		return this.isEdible;
	}
}
