<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.gcetminiwebproject.models.UserModel"%>
<!-- Session validation for bus operator  -->
<%
	if (session.getAttribute("type") == null) {
		response.sendRedirect("index.jsp");
	}
%>
<!-- session validation ends -->

<jsp:include page="layout/Header.jsp" />

<!-- ***********   START   *********** -->
<%
	ResultSet rs = null;
	UserModel um = new UserModel();
	um.setEmail(String.valueOf(session.getAttribute("userid")));
	rs = um.showUserBookings();
%>
<div class="main-body" >
<jsp:include page="layout/UserSidebar.jsp" />
<div class="mymainWrapper ">
	<div class="tableWrapper ">
		<div class="centertitle row ">
			Booking History</div>
		<div class="tableContent ">
			<table class="table tablebordered">
				<tr>
					<th>booking ID</th>
					<th>BusId</th>
					<th>Date</th>
					<th>Time</th>
				</tr>
				<%
					while (rs.next()) {
				%>
				<tr>
					<td><%=rs.getString(1)%></td>
					<td><%=rs.getString(3)%></td>
					<td><%=rs.getString(4)%></td>
					<td><%=rs.getString(5)%></td>
				</tr>
				<%
					}
					rs.close();
				%>
			</table>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />






