import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeModel {

	Connection conn;

	public EmployeeModel() {
		connectDB();
	}

	void connectDB() {
		String url = "";
		String user = "";
		String password = "";

		try {
			conn = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	ResultSet loadEmployees() {
		try {
			Statement statement = conn.createStatement();

			// Execute (insert)
			return statement.executeQuery("SELECT * FROM employee_tbl");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean addEmployee(String name, String dept, int salary) {
		int rowsAffected = 0;

		try {
			String query = "INSERT INTO employee_tbl (name, dept, salary) VALUES (?, ?, ?)";

			PreparedStatement statement = conn.prepareStatement(query);

			statement.setString(1, name);
			statement.setString(2, dept);
			statement.setInt(3, salary);
			rowsAffected = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAffected > 0;
	}

}
