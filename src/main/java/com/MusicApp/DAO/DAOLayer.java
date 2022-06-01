package com.MusicApp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MusicApp.DBConnection.DBConnection;
import com.MusicApp.Entities.Order;
import com.MusicApp.Entities.Product;

public class DAOLayer {

	private  DBConnection db = new DBConnection();
	// private static Connection con = null;

	public boolean insertProduct(Product prod) throws ClassNotFoundException, SQLException {

		boolean f = false;

		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		// write your query here
		String query = "insert into product_tbl(product_name, product_desc, product_price, product_img) values(?,?,?,?)";

		// create statement
		PreparedStatement psmt = con.prepareStatement(query);

		// set the string parameter here
		psmt.setString(1, prod.getpName());
		psmt.setString(2, prod.getpDesc());
		psmt.setInt(3, prod.getpPrice());
		psmt.setString(4, prod.getpImg());
		psmt.executeUpdate();

		f = true;

		db.closeDB();
		return f;
	}

	public boolean deleteProduct(long prodId) throws ClassNotFoundException, SQLException {

		boolean f = false;
		// jdbc code ..
		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		String q = "delete from product_tbl where product_id = ?";

		// PreaparedStatement
		PreparedStatement pstmt = con.prepareStatement(q);

		// set the string parameter
		pstmt.setLong(1, prodId);

		int rowDeleted = pstmt.executeUpdate();
		if (rowDeleted > 0) {
			System.out.println("A product successfully deleted");
		}

		f = true;

		db.closeDB();
		return f;

	}

	public void updateProdcut(Product prod) throws ClassNotFoundException, SQLException {
		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		// generate query
		String query = "update product_tbl set product_name=?,product_desc=?,product_price=?,product_img=? where product_id=?";

		// create preparedStatement
		PreparedStatement pstms = con.prepareStatement(query);

		// set the string parameter
		pstms.setString(1, prod.getpName());
		pstms.setString(2, prod.getpDesc());
		pstms.setInt(3, prod.getpPrice());
		pstms.setString(4, prod.getpImg());
		pstms.setLong(5, prod.getpId());

		pstms.executeUpdate();

		db.closeDB();

	}

	public void showAllProduct() throws ClassNotFoundException, SQLException {
		List<Product> productList = new ArrayList<Product>();
		Product productlist = new Product();

		// jdbc code ..
		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		String q = "select * from product_tbl";

		// Create Statement
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(q);

		while (rs.next()) {

			productlist.setpId(rs.getLong("product_id"));
			productlist.setpName(rs.getString("product_name"));
			productlist.setpDesc(rs.getString("product_desc"));
			productlist.setpPrice(rs.getInt("product_price"));
			productlist.setpImg(rs.getString("product_img"));

			productList.add(productlist);

			System.out.println(productlist);

			/*
			 * long id = rs.getLong(1); String product_name = rs.getString(2); String
			 * product_desc = rs.getString(3); int product_price = rs.getInt(4); String
			 * product_img = rs.getString(5);
			 * 
			 * System.out.println("Product id is: " + id);
			 * System.out.println("Product name is: " + product_name);
			 * System.out.println("Product product desc is: " + product_desc);
			 * System.out.println("Product price is: " + product_price);
			 * System.out.println("Product image is: " + product_img);
			 */

		}

		db.closeDB();
	}

	public boolean insertOrder(Order order) throws ClassNotFoundException, SQLException {

		boolean f = false;

		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		// write your query here
		String query = "insert into order_tbl(product_name, product_price, customers_name, orderDate) values(?,?,?,?)";

		// create statement
		PreparedStatement psmt = con.prepareStatement(query);

		// set the string parameter here
		psmt.setString(1, order.getProductName());
		psmt.setInt(2, order.getpPrice());
		psmt.setString(3, order.getCustomerName());
		psmt.setString(4, order.getDate());
		psmt.executeUpdate();

		f = true;

		db.closeDB();
		return f;
	}

	public void showOrder() throws ClassNotFoundException, SQLException {
		List<Order> orderList = new ArrayList<Order>();
		Order ordlist = new Order();

		// jdbc code ..
		// DBConnection db = new DBConnection();
		Connection con = db.createDBConnection("root", "root", "jdbc:mysql://127.0.0.1:3306/musicDB?user=root");

		String q = "select * from order_tbl";

		// Create Statement
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(q);

		while (rs.next()) {

			ordlist.setoId(rs.getLong("order_id"));
			ordlist.setProductName(rs.getString("product_name"));
			ordlist.setpPrice(rs.getInt("product_price"));
			ordlist.setCustomerName(rs.getString("customers_name"));
			ordlist.setDate(rs.getString("orderDate"));

			orderList.add(ordlist);
			System.out.println(ordlist);

		}

		db.closeDB();
	}

}
