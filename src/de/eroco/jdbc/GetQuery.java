package de.eroco.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetQuery {

	public static void main(String[] args) {

		Connection conn = JDBCUtility.getConnect("admin", "787472@Hari", "zerocode");

		System.out.println(getColumnNames(conn, "students"));
		System.out.println(getColumnNames(conn, "emp"));
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String> getColumnNames(Connection conn, String tableName) {
		List<String> list = new ArrayList<String>();
		Statement smt;
		try {
			smt = conn.createStatement();
			ResultSet res = smt.executeQuery("DESC " + tableName);
			while (res.next()) {
				list.add(res.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
