package com.gcetminiwebproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcetminiwebproject.models.BookingModel;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

/*@WebServlet("/PrintTicketController")
*/
public class PrintTicketController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    
    public PrintTicketController() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		BookingModel model = new BookingModel();
		/* HttpSession session = request.getSession(); */
			
			model.setUserID(request.getParameter("email"));
			

			String bookingID = "";
			try {
                                System.out.println("paran em2 .."+request.getParameter("email"));
				bookingID = model.getBookingIDByEmail();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (!bookingID.equals("")) {
				
					ResultSet rs = null;
					BookingModel bm = new BookingModel();
					bm.setBookingID(bookingID);
					String email = request.getParameter("email");
                                        String ticketPrice =request.getParameter("ticketPrice");
                                        String noOfseats =request.getParameter("numberOfset"); 
                                        System.out.println("before set seat "+noOfseats+" bus id "+request.getParameter("busid"));
                                        bm.setNoOfSeats(noOfseats);
                                        bm.setBusID(request.getParameter("busid"));
					bm.setUserID(email);
                                        //create ticket no
                                        String busNoAndUser =request.getParameter("busid")+"-"+email;
                                        
                                        //save payment information
                                        String ticketNO = bm.savePayment(busNoAndUser);
                                        //get all booking info by Id
					rs = bm.getBookingInfo("user", "na");
					RequestDispatcher rd = request
							.getRequestDispatcher("PrintTicket.jsp");
					request.setAttribute("ticket", rs);
                                        request.setAttribute("ticketPrice", ticketPrice);
                                        request.setAttribute("noOfseats", noOfseats);
                                        request.setAttribute("ticketNO", ticketNO);
					rd.forward(request, response);

				
			} else {
				PrintWriter out = response.getWriter();
				out.print("error");
			}
		
	}
}

