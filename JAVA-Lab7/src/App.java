import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	EmployeeModel EmployeeModel;
	Scanner scanner;

	public App() {
		EmployeeModel = new EmployeeModel();
		scanner = new Scanner(System.in);

		boolean isEnd = false;
		while (!isEnd) {
			System.out.println("Select an option:");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println(" 1) Print all employees");
			System.out.println(" 2) Add an employee");
			System.out.println(" 3) Quit App");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

			try {
				int input = scanner.nextInt();
				scanner.nextLine();

				switch (input) {
				case 1:
					showAllEmployees();
					break;
				case 2:
					promptAddEmployee();
					break;
				case 3:
					isEnd = true;
					break;
				default:
					showError("Please enter one of the numbers listed");
					break;
				}
			} catch (InputMismatchException e) {
				showError("Please enter a number!");
				scanner.next();
			}
		}

		System.out.println("Bye Bye!");
		scanner.close();
		System.exit(0);
	}

	public static void main(String[] args) {
		new App();
	}

	private void promptAddEmployee() {
		boolean isValid = false;

		while (!isValid) {
			try {
				System.out.println("\nPlease enter a name: ");
				String name = scanner.nextLine();

				System.out.printf("\nPlease enter %s's department: \n", name);
				String dept = scanner.nextLine();

				System.out.printf("\nPlease enter %s's salary: \n", name);
				int salary = scanner.nextInt();
				scanner.nextLine();

				if (EmployeeModel.addEmployee(name, dept, salary)) {
					showError("\nSuccessfully added!\n");
				} else {
					showError("It could not be added..Please try again");
				}
				isValid = true;

			} catch (InputMismatchException e) {
				showError("Please enter in valid format.. Please try again");
				scanner.nextLine();
				continue;
			}
		}
	}

	private void showAllEmployees() {
		try {
			ResultSet resultSet = EmployeeModel.loadEmployees();
			if (resultSet == null || !resultSet.isBeforeFirst()) {
				showError("No employee found..");
				return;
			}

			System.out.println("===========================================");
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				String dept = resultSet.getString("dept");
				int salary = resultSet.getInt("salary");

				System.out.printf("%s - %s ($%d)\n", name, dept, salary);
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
			}
			System.out.println("===========================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void showError(String message) {
		System.out.println("\n" + message + "\n");
	}

}
