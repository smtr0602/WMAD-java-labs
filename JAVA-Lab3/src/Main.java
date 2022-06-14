import Animals.Animal;
import Animals.Reptile;
import Animals.Fish;
import Animals.Bird;

public class Main {

	public static void main(String[] args) {
		Animal horse = new Animal(190, 250, "B");
		Reptile gecko = new Reptile(8, 2, null, true, false);
		Fish blobfish = new Fish("md", true, false);
		Bird hummingbird = new Bird(true, true);
				
		System.out.println(horse.getWeight()); 
		System.out.println(gecko.getHasHardSkin());
		System.out.println(blobfish.getIsEdible());
		System.out.println(hummingbird.getCanFly());
		
		System.out.println(horse.toString());
		System.out.println(gecko.toString());
		System.out.println(blobfish.toString());
		System.out.println(hummingbird.toString());
	}

}
