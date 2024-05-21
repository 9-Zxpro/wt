<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.gcetminiwebproject.models.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<jsp:include page="layout/Header.jsp" />

<!-- Session validation for bus operator  -->
<%
	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("busoperator"))){
		response.sendRedirect("BusOperatorLogin.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<%
	String operatorID=String.valueOf(session.getAttribute("userid"));
	 System.out.print(operatorID);
	ResultSet rs = null;
	BusModel model = new BusModel();
	model.setOperatorID(operatorID);
	rs = model.ViewBusData();
%>
	<div class="errordiv ">
	<%
		if (request.getParameter("msg") != null) {
	%>
	<h4><%=request.getParameter("msg")%></h4>
	<%
		}
	%>
		</div>

<div class="main-body" >
<div class="left-column ">
	<ul>
		<li><a href="AddNewBus.jsp">Add new bus</a></li>
		<li><a href="GetAddedBuses.jsp">Show buses</a></li>
		<li><a href="Logout.jsp">Logout</a></li>
	</ul>
</div>
<br/><br/>
<div class="mymainWrapper" style="justify-content: space-around;">
	<div class="tableWrapper">
		<div class="centertitle">
			Added Buses
		</div>
		<div class="tableContent">
			<table class ="table tablebordered">
				<tr>
					<th>BusId</th>
					<th>Bus Name</th>
					<th>Bus Type</th>
					<th>Source City</th>
					<th>Destination City</th>
					<th>Departure Time</th>
					<th>Travel Time</th>
					<th>Cost</th>
					<th>Operating Days</th>
					<th>Seats</th>
				</tr>
	<%
		String busid = "";
		String busname = "";
		String bustype = "";
		String departuretime = "";
		String traveltime = "";
		String sourcecity = "";
		String destinationcity = "";
		float cost = 0;
		int seats = 0;
		String days = "";
		
		while (rs.next()) {
			if (busid.equals("")) {
				busid = rs.getString(1);
				busname = rs.getString(2);
				bustype = rs.getString(3);
				sourcecity = rs.getString(4);
				destinationcity = rs.getString(5);
				departuretime = rs.getString(6);
				traveltime = rs.getString(7);
				cost = rs.getFloat(8);
				days = days + rs.getString(9);
				seats = rs.getInt(10);
			} else {
				if (busid.equals(rs.getString(1))) {
					days = days + ", ";
					days = days + rs.getString(9);
				} else {
	%>
				<tr>
					<td><%=busid%></td>
					<td><%=busname%></td>
					<td><%=bustype%></td>
					<td><%=sourcecity%></td>
					<td><%=destinationcity%></td>
					<td><%=departuretime%></td>
					<td><%=traveltime%></td>
					<td><%=cost%></td>
					<td><%=days%></td>
					<td><%=seats%></td>
					
				</tr>
	<%
		busid = rs.getString(1);
					busname = rs.getString(2);
					bustype = rs.getString(3);
					sourcecity = rs.getString(4);
					destinationcity = rs.getString(5);
					departuretime = rs.getString(6);
					traveltime = rs.getString(7);
					cost = rs.getFloat(8);
					days = rs.getString(9);
					seats = rs.getInt(10);
				}
			}
		}
	%>
				<tr>
					<td><%=busid%></td>
					<td><%=busname%></td>
					<td><%=bustype%></td>
					<td><%=sourcecity%></td>
					<td><%=destinationcity%></td>
					<td><%=departuretime%></td>
					<td><%=traveltime%></td>
					<td><%=cost%></td>
					<td ><%=days%></td>
					<td><%=seats%></td>
				</tr>
			</table>
		</div>
	</div>
</div>
</div>

<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />






