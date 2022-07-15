package databaseUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final String CONN = "";

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}