package Generics;

class Main {
	public static void main(String[] args) {
		MaximumTest<Integer> num1 = new MaximumTest<>();
		MaximumTest<Double> num2 = new MaximumTest<>();

		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, num1.maximum(3, 4, 5));
		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.9, 8.7, num2.maximum(6.6, 8.9, 8.7));
	}
}

class MaximumTest<T extends Number & Comparable<T>> {
	// determines the largest of three Comparable objects

	public MaximumTest() {
	}

	public T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}

		if (z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}
}