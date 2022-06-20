package java_collections.Enums;

public class Main {

	private static PizzaStatus status;

	public enum PizzaStatus {
		ORDERED, READY, PREPARED
	}

	public static void main(String[] args) {
		setStatus();

		if (status == PizzaStatus.READY) {
			System.out.println("Pizza is ready to be shipped!");
		}
	}

	private static void setStatus() {
		status = PizzaStatus.READY;
	}

}