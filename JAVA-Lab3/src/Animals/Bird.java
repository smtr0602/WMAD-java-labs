package Animals;

public class Bird extends Animal {
	private String size;
	private boolean canFly;
	private boolean livesOnLand;
	
	public Bird() {
		super();
		
		this.size = "sm";
		this.canFly = false;
		this.livesOnLand = false;
	}
	
	public Bird(boolean canFly, boolean livesOnLand) {
		super();
		
		this.canFly = canFly;
		this.livesOnLand = livesOnLand;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public boolean getCanFly() {
		return this.canFly;
	}
	
	public boolean getLivesOnLand() {
		return this.livesOnLand;
	}
}
