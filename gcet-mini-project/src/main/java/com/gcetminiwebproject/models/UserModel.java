package com.gcetminiwebproject.models;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcetminiwebproject.utility.DBConnectivity;
import com.gcetminiwebproject.utility.IDGenerator;

public class UserModel {
	public String userID;
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String email;
	public String phoneNumber;
	public String password;

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// insert registration details into user table
	public boolean insertRegistrationData() throws SQLException {
//		this.userID=generateUserId();
		String table = "user";
		String column = "userId";
		IDGenerator idg = new IDGenerator();
		this.userID = idg.generateId(column, table);
		String query = "insert into user values('" + this.userID + "','"
				+ this.firstName + "','" + this.lastName + "','" + this.address
				+ "','" + this.city + "','" + this.email + "',"
				+ this.phoneNumber + ",'" + this.password + " '); ";

		int numRows = 0;
		DBConnectivity dbc = new DBConnectivity();
		try {
			numRows = dbc.fireExecuteUpdate(query);
		} catch (Exception e) {
			System.out.println("Email already in use");
			// MainClass.homePage();
		}

		dbc.close();
		if (numRows > 0) {
			return true;
		} else {
			return false;
		}
	}

	// select tuples for matching user-name
	public ResultSet selectLoginData() throws SQLException {
		ResultSet rs = null;
		String query = "select * from user where EMail='" + this.email
				+ "' and Password='" + this.password + "';";
		DBConnectivity dbc = new DBConnectivity();
		rs = dbc.fireExecuteQuery(query);
		return rs;
	}

	public boolean selectLoginData1() throws SQLException {
		ResultSet rs = null;
		String query = "select * from user where EMail='" + this.email
				+ "' and Password='" + this.password + "';";
		DBConnectivity dbc = new DBConnectivity();
		rs = dbc.fireExecuteQuery(query);
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteRow() {
		DBConnectivity dbc = new DBConnectivity();
		String query = "delete from user where userID='" + this.userID + "';";
		
		
		int numRows = dbc.fireExecuteUpdate(query);
		if (numRows >= 1) {
			dbc.close();
			return true;
		} else {
			dbc.close();
			return false;
		}
	}

	public boolean deleteUserAccount() {
		DBConnectivity dbc = new DBConnectivity();
		
		String query = "delete from user where email='" + this.email + "'";

		
		
		int numRows = dbc.fireExecuteUpdate(query);
		if (numRows >= 1) {
			dbc.close();
			return true;
		} else {
			dbc.close();
			return false;
		}
	}

	public ResultSet showUserBookings() {
		DBConnectivity dbc = new DBConnectivity();
		String query = "select * from booking where userId = '" + this.email
				+ "'";
		System.out.println(query);
		ResultSet rs = dbc.fireExecuteQuery(query);
		return rs;
	}

	public String getUserIDFromEmail(String parameter) throws SQLException {
		
		DBConnectivity dbc = new DBConnectivity();
		ResultSet rs = null;
		String query = "select userid from user where email = \"" + parameter
				+ "\"";
		rs = dbc.fireExecuteQuery(query);
		String userid = "";
		while (rs.next()) {
			userid = rs.getString(1);
		}
		return userid;
	}

	public ResultSet getUserData() {
		ResultSet rs = null;
		DBConnectivity dbc = new DBConnectivity();
		String query = "select * from user where userid='" + this.userID + "';";
		System.out.println(query);
		rs = dbc.fireExecuteQuery(query);
		return rs;
	}

}

