package Sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		// ordered list with duplicates
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(1);
		list1.add(1);
		list1.add(1);

		System.out.println("list1: " + list1);

		// --------------------------------------------

		// ordered set without duplicates
		HashSet<Integer> hsList1 = new HashSet<>();

		hsList1.add(2);
		hsList1.add(3);
		hsList1.add(4);
		hsList1.add(4);
		hsList1.add(1);
		hsList1.add(5);

		System.out.println("hsList1: " + hsList1);

		// --------------------------------------------

		// unordered set without duplicates
		LinkedHashSet<Integer> hsList2 = new LinkedHashSet<>();
		hsList2.add(2);
		hsList2.add(3);
		hsList2.add(4);
		hsList2.add(4);
		hsList2.add(1);
		hsList2.add(5);

		System.out.println("hsList2: " + hsList2);

		// --------------------------------------------

		// ordered set of use defined objects
		HashSet<Animal> animals = new HashSet<>();

		Animal animal1 = new Animal("Cat", 12);
		Animal animal2 = new Animal("Cat", 12);
		Animal animal3 = new Animal("Dog", 5);
		Animal animal4 = new Animal("Turtle", 100);
		Animal animal5 = new Animal("Bird", 1);

		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);

		System.out.println(animals); // [Sets.Animal@95fd7539, Sets.Animal@1f9cb9, Sets.Animal@11178, Sets.Animal@10ceb, Sets.Animal@10ceb]
		System.out.println(animal1.hashCode()); // 68843
		System.out.println(animal2.hashCode()); // 68843
		System.out.println(animal3.hashCode()); // 70008

		// --------------------------------------------
		// unordered key-value pairs
		HashMap<String, String> dictionary = new HashMap<>();

		dictionary.put("word1", "definition1");
		dictionary.put("word2", "definition2");
		dictionary.put("word3", "definition3");

		for (String word : dictionary.keySet()) {
			System.out.println(word);
			// word1
			// word3
			// word2
			System.out.println(dictionary.get(word));
			// definition1
			// definition3
			// definition2
		}

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			//			System.out.println(entry.getKey() + ": " + entry.getValue());
			// word1: definition1
			// word3: definition3
			// word2: definition2
		}

		// --------------------------------------------
		// ordered key-value pairs
		TreeMap<String, String> dictionary2 = new TreeMap<>();
		dictionary2.put("word1", "some definition of word1...");
		dictionary2.put("word2", "some definition of word2...");
		dictionary2.put("word3", "some definition of word3...");
		dictionary2.put("eating", "something.....");

		for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			//word1: some definition of word1...
			// word2: some definition of word2...
			// word3: some definition of word3...
		}

	}

}

class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
}
