package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VatandasDAO {
	public static void printVatandas(Connection connection, String tckimlik) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		// Step 2.B: Creating JDBC Statement
		try {
			statement = connection.prepareStatement("SELECT * FROM vatandas WHERE kimlik_no = ?");
			statement.setString(1, tckimlik);
			resultSet = statement.executeQuery();
			// processing returned data and printing into console
			while (resultSet.next()) {
				System.out.println("Vatandas Bilgileri: " + resultSet.getString(1) + "\t" + resultSet.getInt(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Step 3: Closing database connection
			try {
				if (null != connection) {
					// and then finally close connection
					connection.close();
					resultSet.close();
					statement.close();
				}
			} catch (SQLException sqlex) {
				sqlex.printStackTrace();
			}
		}
		System.out.println("==\t================\t===\t=======");
	}
}
