<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.gcetminiwebproject.models.BusModel"%>
<%@page import="java.sql.ResultSet"%>

<jsp:include page="layout/Header.jsp" />

<% 
	HttpSession session1 = request.getSession();
	if(session1.getAttribute("userid")!= null){ 
%>	
	<jsp:include page="layout/UserSidebar.jsp" />
<% } %>
<script type="text/javascript" src="assets/js/blank.js"></script>

<!-- ***********   START   *********** -->

<%
	String busId = request.getParameter("busid");
%>

	<div class="errordiv">
	<%
		if (request.getParameter("msg") != null) {
	%>
	<h4><%=request.getParameter("msg")%></h4>
	<%
		}
	%>
		</div>

<div class="mymainWrapper">
	<div class="tableWrapper">
		<div class="centertitle">
			Book a Ticket
		</div>
		<%
			BusModel bm = new BusModel();
			ResultSet rs = bm.getBusInfo(request.getParameter("busid"));
			String departureDate = "";
                        departureDate = request.getParameter("date");
			String departureTime = "";
                        String ticketPrice ="";
		%>
		<!-- ********  Enter seat details   *********** -->
		<div class="tableContent">
			<table class ="table table-bordered">
				<tr>
					<th>Bus ID</th>
					<th>Bus Name</th>
					<th>Bus Type</th>
					<th>Departure Date</th>
					<th>Travel Time</th>
					<th>From</th>
					<th>To</th>
					<th>Cost</th>
				</tr>
				<%
					while (rs.next()) {
				%>				
				<tr>
					<td><%=rs.getString(1)%>
					<td><%=rs.getString(2)%>
					<td><%=rs.getString(3)%>
					<td><%=departureDate%>
					<td><%=rs.getString(5)%>
					<td><%=rs.getString(6)%>
					<td><%=rs.getString(7)%>
					<td><%=rs.getString(8)%>
				</tr>
				<%
						
						departureTime = rs.getString(5);
                                                ticketPrice=rs.getString(8);
					}
					rs.close();
				%>
			</table>
	</div>
	<!-- ********  Enter seat details   *********** -->
	
	<div class="centerformWrapper">
		<div class="centerform">
			<form name="bookTicket" action="BookTicketFormController" onsubmit="return validateLogin3();" method="post">
		
				<div class="formgroup">
					<label for="noOfseats">Enter number of seats to book</label>
					<input type="text" name="noOfseats" class="formcontrol">
				</div>
				<%
					if(session1.getAttribute("userid")==null){ 
				%>	
				<div class="formgroup">
					<label for="username">Enter your email</label>
					<input type="text" name="email" class="formcontrol">
				</div>			
				<% } %>
				<div class="formgroup">
					<label for="busid">Bus Id</label>
					<input type="text" name="busid"  class="formcontrol" value="<%=busId%>"/>
				</div>
				<div class="formgroup">
					<label for="deptdate">Departure Date</label>
					<input type="text" name="deptdate"  class="formcontrol" value="<%=departureDate%>"/>
				</div>
				<div class="formgroup">
					<label for="depttime">Departure Time</label>
					<input type="text" name="depttime"  class="formcontrol" value="<%=departureTime%>"/>
				</div>
                                        <input type="hidden" name="ticketPrice" value="<%=ticketPrice%>"/>
				<div class="formgroup">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                                        &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					<button type="submit" name="submit" class="btn btnsuccess">Confirm Reservation</button>
				</div>
			</form>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />






