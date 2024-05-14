package com.gcetminiwebproject.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcetminiwebproject.utility.DBConnectivity;

public class AdminModel {
	private String id;
	private String userid;
	private String password;
	private long date;
	private String oldPassword;
	
	
	public boolean changeAdminPassword() {
		String query = "update admin set password='" + this.password
				+ "' where userid='" + this.userid + "' and password='"+this.oldPassword+"';";
		DBConnectivity dbc = new DBConnectivity();
		int numRows = dbc.fireExecuteUpdate(query);
		if (numRows > 0) {
			dbc.close();
			return true;
		} else {
			dbc.close();
			return false;
		}
	}

	public void setId(String i) {
		this.id = i;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public boolean selectAdminLogin() throws SQLException {
		String query = "select userid from admin where userid='" + this.userid+ "' and password='" + this.password + "';";
		DBConnectivity dbc = new DBConnectivity();
		/* System.out.println(query); */
		ResultSet rs = dbc.fireExecuteQuery(query);
		Boolean r = false;
		while (rs.next()) {
			r = true;
		}
		return r;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	public ResultSet showAllBookings() {
		DBConnectivity dbc = new DBConnectivity();
		String query = "select * from booking";
		System.out.println(query);
		ResultSet rs = dbc.fireExecuteQuery(query);
		return rs;
	}
	
	public ResultSet showAllBusOperators() {
		DBConnectivity dbc = new DBConnectivity();
		String query = "select * from busoperator";
		System.out.println(query);
		ResultSet rs = dbc.fireExecuteQuery(query);
		return rs;
	}
	
	public ResultSet showAllUsers() {
		DBConnectivity dbc = new DBConnectivity();
		String query = "select * from user";
		System.out.println(query);
		ResultSet rs = dbc.fireExecuteQuery(query);
		return rs;
	}
}
