import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	private static Calculator calc;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		calc = new Calculator();

		start();
	}

	private static void start() {
		handleFirstNum();
		handleOperator();
		handleSecondNum();
		showResult();

		handleContinueOrExit("");
	}

	private static void handleFirstNum() {
		boolean isValid = false;
		System.out.print("Please enter the first number: ");

		while (!isValid) {
			try {
				double num = scanner.nextDouble();
				isValid = true;
				calc.setNum1(num);

			} catch (InputMismatchException e) {
				System.out.println("Enter in valid data type");
				scanner.next();
			}
		}
	}

	private static void handleSecondNum() {
		boolean isValid = false;
		System.out.print("Please enter the second number: ");

		while (!isValid) {
			try {
				double num = scanner.nextDouble();
				if (num == 0 && calc.getOperator().equals("/")) {
					System.out.println("Cannot devide by zero!");
					continue;
				}
				isValid = true;
				calc.setNum2(num);

			} catch (InputMismatchException e) {
				System.out.println("Enter in valid data type");
				scanner.next();
			}
		}
	}

	private static void handleOperator() {
		boolean isValid = false;
		System.out.println("Choose an operation:\n");

		while (!isValid) {
			try {
				for (int i = 0; i < Calculator.operators.length; i++) {
					System.out.printf("> Type %s for %s %n", Calculator.operators[i][0], Calculator.operators[i][1]);
				}
				String operator = scanner.next();
				if (!isValidOperator(operator)) {
					throw new Exception();
				}
				isValid = true;
				calc.setOperator(operator);

			} catch (Exception e) {
				System.out.println("Please enter valid operator! \n");
				scanner.next();
			}
		}
	}

	private static boolean isValidOperator(String operator) {
		boolean isValid = false;

		for (int i = 0; i < Calculator.operators.length; i++) {
			if (operator.equals(Calculator.operators[i][0])) {
				isValid = true;
			}
		}
		return isValid;
	}

	private static void showResult() {
		double result = calc.calculate();

		System.out.printf("%f %s %f = %f %n%n", calc.getNum1(), calc.getOperator(), calc.getNum2(), result);
	}

	private static void handleContinueOrExit(String message) {
		boolean isValid = false;

		while (!isValid) {
			// show message if exists
			if (!message.equals("")) {
				System.out.println(message);
			}

			try {
				System.out.println("Do you want to continue or quit?");
				String input = scanner.next();

				if (!(input.equals("continue") || input.equals("quit"))) {
					throw new Exception();
				} else if (input.equals("quit")) {
					System.out.println("Bye bye!");

					scanner.close();
					System.exit(0);
					return;
				} else {
					start();
				}

			} catch (Exception e) {
				handleContinueOrExit("Enter 'continue or 'quit'");
				scanner.next();
			}
		}

	}

}
