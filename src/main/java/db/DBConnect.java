package db;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.43.2:3306/hospital", "", "");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}