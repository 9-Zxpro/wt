<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.gcetminiwebproject.models.*" %>
<%@ page import="java.sql.ResultSet" %>

<!-- Session validation for bus operator  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("AdminLogin.jsp");
	}
%>
<!-- session validation ends -->
<jsp:include page="layout/Header.jsp" />
<!-- ***********   START   *********** -->
<%
 BusOperatorModel model = new BusOperatorModel();
ResultSet rs=model.getAllOperatorData(); 
%>

<div class="main-body" >
<jsp:include page="layout/AdminSidebar.jsp" />

<div class="mymainWrapper">
	<div class="tableWrapper ">
		<div class="centertitle">
			Delete Bus Operator
		</div>
		<div class="errordiv" style="margin-bottom: 10px;">
	<%
		if (request.getParameter("msg") != null) {
	%>
	<h4 style="color:red; margin-bottom: 5px;"><%=request.getParameter("msg")%></h4>
	<%
		}
	%>
		</div>
		<div class="tableContent">
			<table class ="table tablebordered">
				<tr>
					<th>Operator Id</th>
					<th>Operator Name</th>
					<th>Address</th>
					<th>EMail</th>
					<th>City</th>
					<th>Phone Number</th>
					<th>Password</th>
					<th> Delete </th>
				</tr>
				<%
					while(rs.next())
					{
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><%=rs.getString(5) %></td>
					<td><%=rs.getString(6) %></td>
					<td><%=rs.getString(7) %></td>
					<td><a href="DeleteBusOperatorByAdminController?operatorid=<%=rs.getString(1)%>"><span class="glyphicon glyphicon-trash">x</span></a></td>
				</tr>
				<%} %>
			</table>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />