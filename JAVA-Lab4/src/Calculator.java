public class Calculator {

	private double num1;
	private double num2;
	private String operator;

	static String[][] operators = { { "+", "addition" }, { "-", "subtraction" }, { "*", "multiplication" },
			{ "/", "division" } };

	public Calculator() {

	}

	public double calculate() {
		double result = 0;
		switch (operator) {
		case "+":
			result = add();
			break;
		case "-":
			result = subtract();
			break;
		case "*":
			result = multiply();
			break;
		case "/":
			result = divide();
			break;
		}
		return result;
	}

	private double add() {
		return (num1 + num2);
	}

	private double subtract() {
		return (num1 - num2);
	}

	private double multiply() {
		return (num1 * num2);
	}

	private double divide() {
		return (num1 / num2);
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num) {
		this.num1 = num;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num) {
		this.num2 = num;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
