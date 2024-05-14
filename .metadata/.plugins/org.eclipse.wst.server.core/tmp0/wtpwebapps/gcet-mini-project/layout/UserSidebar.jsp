<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="left-column">
	<div class="userdetails">
	<%
	try {
		String msg = "";
		if (request.getParameter("msg") != null) {
			out.print("<div class='errorMessage'>" + msg + "</div>");
		}
	} catch (Exception e) {

	}

	try {
		if (session.getAttribute("type").equals("user")) {
			out.print("Welcome, "
					+ session.getAttribute("email"));
		}
	} catch (Exception e) {

	}
%>
	</div>
	<ul>
		<li><a href="indexUser.jsp">Home</a></li>
		<li><a href="SearchBusForm.jsp">Search Bus</a></li>
		<li><a href="CancelTicket.jsp">Cancel Ticket</a></li>
		<li><a href="GetBookingHistory.jsp">View booking history</a></li>
		<li><a href="Logout.jsp">Logout</a></li>
	</ul>
</div>