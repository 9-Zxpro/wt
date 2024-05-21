package com.gcetminiwebproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcetminiwebproject.models.BusOperatorModel;

public class DeleteBusOperatorByAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteBusOperatorByAdminController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BusOperatorModel model=new BusOperatorModel();
		String operatorID=request.getParameter("operatorid");
		model.setOperatorID(operatorID);
		model.deleteOperatorAccountFromAdmin();
		response.sendRedirect("DeleteBusOperatorByAdmin.jsp?msg=operator deleted successfully");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
