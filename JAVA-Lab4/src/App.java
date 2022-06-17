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
		System.out.print("Please enter the first number: ");

		double num = scanner.nextDouble();
		calc.setNum1(num);
	}

	private static void handleSecondNum() {
		System.out.print("Please enter the second number: ");

		double num = scanner.nextDouble();

		System.out.print("Please enter aaa: ");
		calc.setNum2(num);
	}

	private static void handleOperator() {
		System.out.println("Choose an operation:\n");

		for (int i = 0; i < Calculator.operators.length; i++) {
			System.out.printf("> Type %s for %s %n", Calculator.operators[i][0], Calculator.operators[i][1]);
		}
		String operator = scanner.next();
		if (!isValidOperator(operator)) {
			System.out.println("Please enter valid operator! \n");
			handleOperator();
			return;
		}
		calc.setOperator(operator);
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

		// show message if exists
		if (!message.equals("")) {
			System.out.println(message);
		}

		System.out.println("Do you want to continue or quit?");
		String input = scanner.next();

		if (input.equals("continue")) {
			start();
			return;
		} else if (input.equals("quit")) {
			System.out.println("Bye bye!");

			scanner.close();
			System.exit(0);
			return;
		}
		handleContinueOrExit("Enter 'continue or 'quit'");
	}

}
