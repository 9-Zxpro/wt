package com.gcetminiwebproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcetminiwebproject.models.BusOperatorModel;

public class AddNewBusOperatorFormController  extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddNewBusOperatorFormController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BusOperatorModel model=new BusOperatorModel();
		
		model.setOpeartorName(request.getParameter("busoperatorname"));
		model.setEmail(request.getParameter("email"));
		model.setAddress(request.getParameter("address"));
		model.setCity(request.getParameter("city"));
		model.setPhoneNumber(request.getParameter("phonenumber"));
		
		if(request.getParameter("password").equals(request.getParameter("newpassword")))
		{
			model.setPassword(request.getParameter("password"));
			model.insertRegistrationData();
			response.sendRedirect("addnewbusoperator.jsp?msg=Bus operator added successfully..");	
		}
		else{
			response.sendRedirect("addnewbusoperator.jsp?msg=Password Does not match..");
		}
			
	}

}
