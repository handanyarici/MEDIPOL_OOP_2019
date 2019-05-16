package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static String url = "jdbc:mysql://remotemysql.com:3306/Qo1zJxmlyc,Qo1zJxmlyc,RfRKNWNfe2";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "Qo1zJxmlyc";
	private static String password = "RfRKNWNfe2";
	private static Connection con;

	public static Connection getConnection() {
		// variables
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Problem in" + " loading MySQL JDBC driver");
			cnfex.printStackTrace();
		}

		// Step 2: Opening database connection
		try {

			// Step 2.A: Create and
			// get connection using DriverManager class
			connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Qo1zJxmlyc", "Qo1zJxmlyc",
					"RfRKNWNfe2");
			return connection;
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
		return connection;
	}
}