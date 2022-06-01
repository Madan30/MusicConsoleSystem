package com.MusicApp.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.MusicApp.DBConnection.DBConnection;
import com.MusicApp.Entities.Customer;
import com.MusicApp.ExceptionHandling.ProductNotFoundException;
import com.MusicApp.Menu.MainMenu;
import com.MusicApp.Menu.Menu;

public class UserDAOLayer {
	private MainMenu menu = new MainMenu();
	
	private Menu m = new Menu();
	//private static Connection con;

	private  DBConnection db = new DBConnection();

	public boolean insertUser(Customer cus) throws ClassNotFoundException, SQLException {

		boolean f = false;

		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		
		// write your query here
		String query = "insert into customer_tbl(first_name, last_name, address, phoneNumber, username,pwd) values(?,?,?,?,?,?)";

		// create statement
		PreparedStatement psmt = con.prepareStatement(query);

		// set the string parameter here
		psmt.setString(1, cus.getFirstName());
		psmt.setString(2, cus.getLastName());
		psmt.setString(3, cus.getAddress());
		psmt.setString(4, cus.getPhoneNum());
		psmt.setString(5, cus.getUserName());
		psmt.setString(6, cus.getPassword());
		psmt.executeUpdate();

		f = true;

		db.closeDB();
		return f;
	}

	public String loginUser(Customer cus) throws ClassNotFoundException, SQLException, IOException,
			ProductNotFoundException, EncryptedDocumentException, InvalidFormatException {

		String username = cus.getUserName();
		String pwd = cus.getPassword();

		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		
		String uname = " ";
		String pwds = " ";

		// write your query here
		/* String query = "select from customer_tbl where username=? AND pwd=?"; */
		String query = "select username, pwd from customer_tbl";
		
		//System.out.println("Executing query");

		// create statement
		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery(query);

		while (rs.next()) {

			uname = rs.getString("username");
			pwds = rs.getString("pwd");

			if (username.equals(uname) && pwd.equals(pwd)) {
				System.out.println("Login success");
				m.chooseMenu();
			}

		}
		db.closeDB();
		System.out.println("Invalid credentials");
		return "menu.mainMenu()";

	}

}
