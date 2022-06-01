package com.MusicApp.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// private String username = "root";
	// private String password = "root"; private
	// private String url = "jdbc:mysql://127.0.0.1:3306/musicDB?user=root";

	private String driver = "com.mysql.cj.jdbc.Driver";
	private Connection con;

	public Connection createDBConnection(String username, String password, String url)
			throws SQLException, ClassNotFoundException {

		// step 1: load the driver
		Class.forName(driver);

		// step 2: get the connection
		con = DriverManager.getConnection(url, username, password);

		return con;

		// return con = DriverManager.getConnection(username, password, url);

	}

	// creating db close connection method
	public void closeDB() throws SQLException {
		con.close();
	}

}
