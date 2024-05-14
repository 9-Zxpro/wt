package com.gcetminiwebproject.utility;

import java.sql.SQLException;
import java.sql.ResultSet;

public class SessionManager {


	public static String userID;
	public static String userEMail;
	public static String userPhoneNumber;

	public SessionManager() {
		SessionManager.userID = "NA";
		SessionManager.userEMail = "NA";
		SessionManager.userPhoneNumber = "NA";
	}

	public static void setSession(String email, String who) throws SQLException {
		SessionManager.userEMail = email;
		if (who.equalsIgnoreCase("user")) {
			SessionManagerModel sm = new SessionManagerModel();
			sm.getUserIDFromEmail(email);
		}		
		else {
			SessionManagerModel sm = new SessionManagerModel();
			sm.getBusOperatorIDFromEmail(email);
		}
	}

	public static void setUserID(String userID) {
		SessionManager.userID = userID;
	}

	public static void setUserEMail(String userEMail) {
		SessionManager.userEMail = userEMail;
	}

	public static void setUserPhoneNumber(String userPhoneNumber) {
		SessionManager.userPhoneNumber = userPhoneNumber;
	}

}

class SessionManagerModel {

	public void getUserIDFromEmail(String email) throws SQLException {
		String query = "select UserID, PhoneNumber from user where email='"
				+ email + "';";
		DBConnectivity dbc = new DBConnectivity();
		ResultSet rs = null;
		rs = dbc.fireExecuteQuery(query);
		while (rs.next()) {
			SessionManager.userID=rs.getString(1);
			SessionManager.userPhoneNumber=rs.getString(2);
		}
	}
	public void getBusOperatorIDFromEmail(String email) throws SQLException {
		String query = "select OperatorID, PhoneNumber from busOperator where email='"
			+ email + "';";
		DBConnectivity dbc = new DBConnectivity();
		ResultSet rs = null;
		rs = dbc.fireExecuteQuery(query);
		while (rs.next()) {
			SessionManager.userID=rs.getString(1);
			SessionManager.userPhoneNumber=rs.getString(2);
		}
	}
}

