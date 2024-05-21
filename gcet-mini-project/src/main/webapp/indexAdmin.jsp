<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="layout/Header.jsp" />

<!-- Session validation for bus operator  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("index.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<div class="main-body" >
 <jsp:include page="layout/AdminSidebar.jsp" />
 <div class="dashboard ">
	<div class="dashboardBody ">
		<div class="formTitle">Admin Dashboard</div>
		
		<div class="dashboarddiv ">
			<div class="odd ">
				<div class="dashimg">
					View Bus Operator
				</div>
				<div class="dashcontent">
					<a href="ViewBusOperators.jsp">View</a>
				</div>
			</div>
			<div class="odd">
				<div class="dashimg">
					View Bookings
					</div>
				<div class="dashcontent">					
					<a href="ViewAllBookings.jsp">View</a>
				</div>
			</div>
			<div class="odd">
				<div class="dashimg">
					Delete Bus Operator
					</div>
				<div class="dashcontent">					
					<a href="DeleteBusOperatorByAdmin.jsp">Delete</a>
				</div>
			</div> 
			</div>
			<div class="dashboarddiv ">
			<div class="even ">
				<div class="dashimg">
					Add Bus Operator
					</div>
				<div class="dashcontent">					
					<a href="addnewbusoperator.jsp">Add</a>
				</div>
			</div>
			<div class="even ">
				<div class="dashimg">
					View Users
					</div>
				<div class="dashcontent">					
					<a href="ViewRegisteredUsers.jsp">View</a>
				</div>
			</div>
			<div class="even ">
				<div class="dashimg">
					Logout
					</div>
				<div class="dashcontent">					
					<a href="Logout.jsp">Signout</a>
				</div>
			</div>
			</div>
		</div>
	</div>
 </div>


<jsp:include page="layout/Footer.jsp" />
