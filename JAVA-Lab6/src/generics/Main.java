package generics;

class Main {
	public static void main(String[] args) {
		int num1 = MaximumTest.maximum(3, 8, 5);
		double num2 = MaximumTest.maximum(6.6, 8.9, 8.7);

		// MaximumTest
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 8, 5, num1);
		System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.9, 8.7, num2);

		// MaximumTest2
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, MaximumTest2.maximum(3, 4, 5));
		System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.9, 8.7, MaximumTest2.maximum(6.6, 8.9, 8.7));
	}
}

class MaximumTest {

	public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
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

class MaximumTest2 {

	public static <T extends Number> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.doubleValue() > max.doubleValue()) {
			max = y; // y is the largest so far
		}

		if (z.doubleValue() > max.doubleValue()) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}
}