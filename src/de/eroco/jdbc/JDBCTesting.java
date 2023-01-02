package de.eroco.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTesting {
	
	public static void main(String[] args) {
		
		String user = "admin";
		String password = "787472@Hari";
		String schema = "zerocode";
		Connection conn = JDBCUtility.getConnect(user, password, schema);
		//System.out.println((JDBCUtility.createTbl(conn, "student", "rollno int unique not null, name varchar(40) not null, age int not  null, mobileno varchar(13) not null, email varchar(40) not null")));
		//System.out.println(JDBCUtility.updateTable(conn, "emp", "sal", "10000", "name", "MAHESH"));
		//System.out.println(JDBCUtility.getColumnNames(conn, "emp"));
		//System.out.println(JDBCUtility.getData(conn, "name", "emp", "empid", "ABC@101"));
		//System.out.println(JDBCUtility.deleteData(conn, "emp", "empid", "ABC@102"));
		//System.out.println(JDBCUtility.writeQuery(conn, query));
		//System.out.println(JDBCUtility.getTable(conn, "students"));
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
