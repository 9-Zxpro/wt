package com.gcetminiwebproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gcetminiwebproject.utility.Validate;
import com.gcetminiwebproject.models.AdminModel;
import com.gcetminiwebproject.models.UserModel;

public class LoginFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginFormController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String userPassword = request.getParameter("password");
		String type = request.getParameter("type");

		
		// form validation
		String errorMessage = Validate.validateLogin(userName, userPassword);
		if (!errorMessage.equalsIgnoreCase("")) {
			if(type.equalsIgnoreCase("user")){
				response.sendRedirect("index.jsp?msg="+errorMessage);
			}
			else{
				response.sendRedirect("AdminLogin.jsp?msg="+errorMessage);
			}
		}
		else{
	
			if (type.equalsIgnoreCase("admin")) {
	
				AdminModel am = new AdminModel();
				am.setUserid(userName);
				am.setPassword(userPassword);
				Boolean login = false;
				try {
					login = am.selectAdminLogin();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (login == true) {
					HttpSession session = request.getSession();
					session.setAttribute("email", userName);
					session.setAttribute("userid", userName);
					session.setAttribute("type", type);
					response.sendRedirect("indexAdmin.jsp");
				}else{
					String msg = " Username password not match..";
					response.sendRedirect("index.jsp?msg=" + msg);
				}
	
			} else if (type.equalsIgnoreCase("user")) {
				UserModel um = new UserModel();
				um.setEmail(userName);
				um.setPassword(userPassword);
				Boolean login = false;
				try {
					login = um.selectLoginData1();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (login == true) {
					HttpSession session = request.getSession();
					session.setAttribute("email", userName);
					session.setAttribute("type", type);
					String userid = "";
					try {
						userid = um.getUserIDFromEmail(userName);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					session.setAttribute("userid", userid);
					response.sendRedirect("indexUser.jsp");
				}
				else{
					String msg = " Username password not match..";
					response.sendRedirect("index.jsp?msg=" + msg);
				}
			}
		}
	}
}


