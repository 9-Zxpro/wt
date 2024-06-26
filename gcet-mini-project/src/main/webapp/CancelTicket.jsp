<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.gcetminiwebproject.models.*"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>
<!-- ********  Start  *********** -->



<%
		ResultSet rs = null;
		UserModel um = new UserModel();
		um.setEmail(String.valueOf(session.getAttribute("userid")));
		rs = um.showUserBookings();
	%>
	

	<div class="main-body" >
<jsp:include page="layout/UserSidebar.jsp" />
<div class="mymainWrapper myWindow">
<div class="commonWindow">
	<div class="tableWrapper">
		<div class="centertitle row">
			Booking History
		</div>
		<div class="tableContent ">
			<table class ="table tablebordered">
				<tr>
					<th>booking ID</th>
					<th>BusId</th>
					<th>Date</th>
					<th>Time</th>
				</tr>
				<%
					while(rs.next()){
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><%=rs.getString(5) %></td>
				</tr>
					<%} 
						rs.close();
					%>
			</table>
		</div>
	</div>
</div>


	<div class="centerformWrapper">
		<div class="formTitle ">Cancel Ticket</div>
		<div class="errordiv ">
		<%-- <%
			if (request.getParameter("msg") != null) {
		%>
		<h4><%=request.getParameter("msg")%> for booking ID <%=request.getParameter("bid")%></h4>
		<%
			}
		%> --%>
		<%
                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg +" for booking ID " + request.getParameter("bid"));
                }
            %>
		</div>
		<div class="centerform ">
			<form name="cancelTicket" action="CancelTicketController" method="post">
				<% 
					HttpSession session1 = request.getSession();
					if(session1.getAttribute("userid")!=null){ 
				%>	
				<div class="formgroup">
					<label for="bookingid">Enter the booking id</label>
					<input type="text" name="bookingid" class="formcontrol">
				</div>		
				<% } else { %>
				<div class="formgroup">
					<label for="bookingid">Enter the booking id</label>
					<input type="text" name="bookingid" class="formcontrol">
				</div>
				<div class="formgroup">
					<label for="username">Enter your email</label>
					<input type="text" name="email" class="formcontrol">
				</div>
				<% } %>
				<div class="formgroup">
					<button type="submit" name="submit" class="btn btndanger">Submit</button>
				</div>
			</form>
		</div>
	</div>
	</div>
	</div>

<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />







