package de.eroco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.zeroco.assignment.Utility;
import de.zeroco.db.QueryBuilder;

public class JDBCUtility {
	
	public final static String WORKBENCH_URL = "jdbc:mysql://localhost:3306/";
	public final static String CLASS_URL = "com.mysql.cj.jdbc.Driver";
	
	/*public static void main(String[] args) {
		
		String user = "admin";
		String password = "787472@Hari";
		String schema = "zerocode";
		//Connection conn = JDBCUtility.getConnect(user, password, schema);
		List<String> clmnName = getColumnNames(conn, "students");
		List<String> clmn = new ArrayList<String>(Arrays.asList("*"));
		List<Object> data = new ArrayList<Object>(Arrays.asList("ABC@109"));
		//System.out.println("data inserted and keyvalue is : " + getGenerateKey(conn, schema, "students", clmn, data));
		//List<String> clmn = new ArrayList<String>(Arrays.asList("name"));
		//List<Object> data = new ArrayList<Object>(Arrays.asList("KARTHIK","102"));
		//System.out.println(updateTable(conn, schema, "students", clmn, data, "rollno"));
		//System.out.println(getData(conn, schema, "students", clmn));
		System.out.println(getData(conn, schema, "students", clmn, "rollno", "103"));
		closeConnection(conn);
	}*/
	/**
	 * This method is used to connect to database
	 * @author HARINATH
	 * @since 20/12/2022
	 * @param user
	 * @param password
	 * @return Connection
	 */
	public static Connection getConnect(String user, String password, String schema) {
		if (Utility.isBlankWithVar(user,password)) return null;
		Connection conn = null;
		try {
			Class.forName(CLASS_URL);
			conn = DriverManager.getConnection(WORKBENCH_URL+schema, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * This method is used to close the opened connection 
	 * @author HARINATH
	 * @since 22/12/2022
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to excute query 
	 * @author HARINATH
	 * @since 20/12/2022
	 * @param user
	 * @param password
	 * @param query
	 * @return 
	 */
	public static String writeQuery(Connection conn, String query) {
		if (Utility.isBlankWithVar(query)) return null;
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement(query);
			psmt.execute();
			return "successfully executed.";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * This method used to get column names available in the database table
	 * @author HARINATH
	 * @since 20/12/2022
	 * @param conn
	 * @param tableName
	 * @return List
	 */
	public static List<String> getColumnNames(Connection conn, String tableName){
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
	/**
	 * This method is used to create table in my sql database 
	 * @author HARINATH
	 * @since 20/12/2022
	 * @param user
	 * @param password
	 * @param tableNameWithColumnName
	 * @return String
	 */
	public static String createTbl(Connection conn, String tableName, String...columnNames) {
		String clmName = "";
		for (String names : columnNames) {
			clmName += names+",";
		}
		clmName = clmName.endsWith(",")?clmName.substring(0, clmName.length()-1):clmName;
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement("CREATE TABLE " + tableName + " (" + clmName + ") ");
			psmt.execute();
			return tableName + " table created succesfully.";
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return "";	
	}
	/**
	 * This method used to inert data to my sql table 
	 * @author HARINATH
	 * @since 20/12/2022
	 * @param user
	 * @param password
	 * @param tableName
	 * @param values
	 * @return String
	 */
	public static int getGenerateKey(Connection conn,String schema, String tableName, List<String> columns, List<Object> values) {
		if (Utility.isBlankWithVar(values)) return 0;
		PreparedStatement psmt = null;
		int pk = 0;
		try {
			psmt = conn.prepareStatement(QueryBuilder.getInsertQuery(schema, tableName, columns),new String[] { "id" });
			int count = 1;
			for (Object value : values) {
				psmt.setObject(count ++, value);
			}
			if (psmt.executeUpdate() > 0) {
				ResultSet res = psmt.getGeneratedKeys();
				if (res.next()) {
					pk = res.getInt(2);
				}
			}
			return pk;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * This method used to update record in my sql table 
	 * @param conn
	 * @param tableName
	 * @param clmName
	 * @param newData
	 * @param condition
	 * @return String
	 */
	public static String updateTableData(Connection conn,String schema, String tableName, List<String> columns, List<Object> values, String refClmn) {
		if (Utility.isBlankWithVar(tableName)) return "";
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement(QueryBuilder.getUpdateQuery(schema, tableName, columns, refClmn));
			int count = 1;
			for (Object value : values) {
				psmt.setObject(count ++, value);
			}
			psmt.execute();
			return "data updated successfully.";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * This method is used to get data from database table
	 * @author 	HARINATH
	 * @since 20/12/2022
	 * @param conn
	 * @param needData
	 * @param tableName
	 * @param refColumName
	 * @param refData
	 * @return list
	 */
	public static List<String> getData(Connection conn, String schema, String tableName, List<String> columns, String query){
		if (Utility.isBlankWithVar(tableName)) return null;
		List<String> list = new ArrayList<String>();
		Statement smt = null;
		try {
			smt = conn.createStatement();
			ResultSet res = smt.executeQuery(query);
			ResultSetMetaData rsmd = res.getMetaData();
			while (res.next()) {
				for (int i = 1; i < rsmd.getColumnCount()+1; i++) {
					list.add(res.getString(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<String> getData(Connection conn, String schema, String tableName, List<String> columns, String refColumn, String refData){
		if (Utility.isBlankWithVar(tableName)) return null;
		return getData(conn, schema, tableName, columns, QueryBuilder.getDataQuery(schema, tableName, columns, refColumn, refData));
	}
	
	/**
	 * This method is used to delete particular data with using reference details
	 * @author HARINATH
	 * @since 21/12/2022
	 * @param conn
	 * @param tableName
	 * @param refColumName
	 * @param refData
	 * @return String
	 */
	public static String deleteData(Connection conn, String tableName, String refColumName, String refData ) {
		if (Utility.isBlankWithVar(tableName,refColumName,refData)) return null;
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement(QueryBuilder.getDeleteQuery(refData, tableName, refColumName, refData));
			psmt.execute();
			return refData + "data deleted successfully.";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	/*public static String changeFormate(Connection conn, String schema, String tableName,List<String> columns) {
		List<String> values = new ArrayList<String>();
		values = getData(conn, schema, tableName, columns, QueryBuilder.getClmnsDataQuery(schema, tableName, columns));
		Statement smt = null;
		PreparedStatement psmt = null;
		int countfour = 1;
		try {
			smt = conn.createStatement();
			int count = 0;
			int countthree = 0;
			while (count <= values.size()-1) {
				String tName = values.get(count);
				String clmnName = values.get(++count);
				String refClmn= values.get(2);
				ResultSet res = smt.executeQuery(QueryBuilder.getClmnsDataQuery(schema, tName, Arrays.asList(clmnName)));	
				int countTwo = 1;
				while (res.next()) {
					psmt = conn.prepareStatement("UPDATE "+ tName +" SET "+ refClmn +" = '" + (Utility.getString(res.getString(clmnName))) 
							+ "' WHERE pk_id = "+ (countTwo++) + ";");
					psmt.executeUpdate();
					updateTableData(conn, schema, tableName, Arrays.asList("status"), Arrays.asList("success",countthree++), "pk_id");
				}
				count += 2;
			}
		} catch (SQLException e) { 
			updateTableData(conn, schema, tableName, Arrays.asList("status","failure_reason"), Arrays.asList("failed", e ,countfour++), "pk_id");
			e.printStackTrace();
		}
		return "Data updated";
	}*/
	public static String changeFormate(Connection conn, String schema, String tableName,List<String> columns) {
		if (Utility.isBlankWithVar(schema,tableName)) return "";
		List<String> values = getData(conn, schema, tableName, columns, QueryBuilder.getClmnsDataQuery(schema, tableName, columns));
		Statement smt = null;
		int countFour = 1;
		try {
			int count = 0;
			int countTwo = 0;
			smt = conn.createStatement();
			while (count <= values.size()-1) {
				String tName = values.get(count);
				String clmnName = values.get(++count);
				String refClmn= values.get(2);
				ResultSet res = smt.executeQuery(QueryBuilder.getClmnsDataQuery(schema, tName, Arrays.asList(clmnName)));
				int countThree = 1;
				while (res.next()) {
					updateTableData(conn, schema, tName, Arrays.asList(refClmn), Arrays.asList(Utility.getString(res.getString(clmnName)),countThree++), "pk_id");
					updateTableData(conn, schema, tableName, Arrays.asList("status"), Arrays.asList("success",countTwo++), "pk_id");
				}
				count += 2;
			}
			return "Data updated";
		} catch (SQLException e) { 
			updateTableData(conn, schema, tableName, Arrays.asList("status","failure_reason"), Arrays.asList("failed", " " + e ,countFour++), "pk_id");
			e.printStackTrace();
		}
		return "";
	}
	public static void main(String[] args) {
		String user = "admin";
		String password = "787472@Hari";
		String schema = "zerocode";
		List<String> column = new ArrayList<String>(Arrays.asList("data_set","source_column","target_column"));
		Connection conn = JDBCUtility.getConnect(user, password, schema);
		System.out.println(changeFormate(conn, schema, "app_migration", column));
		closeConnection(conn);
	}
}
