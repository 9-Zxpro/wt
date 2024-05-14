package com.gcetminiwebproject.utility;

import java.sql.*;

public class DBConnectivity {
	private Connection conn;
	private String driver;
	private String uname;
	private String pwd;
	private String url;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DBConnectivity() {
		driver = "com.mysql.cj.jdbc.Driver";
		uname = "root";
		pwd = "patelji";
		url = "jdbc:mysql://localhost:3306/btrs";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uname, pwd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int fireExecuteUpdate(String query) {
		int n = 0;
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());	
		}
		return n;
	}

	public ResultSet fireExecuteQuery(String query) {
		rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	public PreparedStatement fireExecuteQueryPrepare(String query ){
		
		try {
			pstmt = conn.prepareStatement(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
		
	}

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
