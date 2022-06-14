package Animals;

public class Reptile extends Animal {
	private boolean hasHardSkin;
	private boolean hasHardShelledEggs;
	
	public Reptile() {
		super();

		this.hasHardSkin = false;
		this.hasHardShelledEggs = false;
	}
	
	public Reptile(int height, int weight, String bloodType, boolean hasHardSkin, boolean hasHardShelledEggs) {
		super(height, weight, bloodType);
		
		this.hasHardSkin = hasHardSkin;
		this.hasHardShelledEggs = hasHardShelledEggs;
	}
	
	public boolean getHasHardSkin() {
		return this.hasHardSkin;
	}
	
	public boolean getHasHardShelledEggs() {
		return this.hasHardShelledEggs;
	}

	@Override
	public String toString() {
		return "Reptile [hasHardSkin=" + hasHardSkin + ", hasHardShelledEggs=" + hasHardShelledEggs
				+ ", getHasHardSkin()=" + getHasHardSkin() + ", getHasHardShelledEggs()=" + getHasHardShelledEggs()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getBloodType()=" + getBloodType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
