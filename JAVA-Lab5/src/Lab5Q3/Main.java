package Lab5Q3;

import java.util.ArrayList;
import java.util.Comparator;

class Car implements Comparable<Car> {
	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}

	@Override
	// This is for when null is passed in sort()
	public int compareTo(Car o) {
		if (year == o.year) {
			return 0;
		} else if (year > o.year) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Main {

	/**
	 * Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
	 * Create an ArrayList of Car objects.
	 * Sort the ArrayList of cars by year (Ascending) and print them out.
	 */
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();

		cars.add(new Car("Jeep", "Wrangler", 1986));
		cars.add(new Car("Honda", "Civic", 1975));
		cars.add(new Car("Toyota", "Camry", 1982));

		for (Car car : cars) {
			System.out.println("Element: " + car);
		}

		System.out.println("-----");

		// cars.sort(null);
		cars.sort(new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o2.getYear() - o1.getYear();
			}

		});

		for (Car car : cars) {
			System.out.println("Element: " + car);
		}
	}

}
