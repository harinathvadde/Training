package de.eroco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToJDBC {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zerocode", "admin", "787472@Hari");
			Statement smt = con.createStatement();
			String queryone = "INSERT INTO students VALUES(105,'TEJA',29,'7648756985','TEJA123@GMAIL.COM')";
			smt.executeUpdate(queryone);
			System.out.println("DATA INSERTED SUCCESSFULLY");
			ResultSet rse=smt.executeQuery("select mobileno from students where rollno = 104");
			while (rse.next()) {
				System.out.println(rse.getString("mobileno"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
