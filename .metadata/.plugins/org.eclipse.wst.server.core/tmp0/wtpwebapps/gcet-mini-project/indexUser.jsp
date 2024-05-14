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
<jsp:include page="layout/UserSidebar.jsp" />
<div class="dashboard">
	<div class="dashboardBody ">
		<div class="formTitle">User Dashboard</div>
		<div class="dashboarddiv ">
			<div class="odd">
				<div class="dashimg">
					<span class="glyphicon glyphicon-search"></span>Search Bus
				</div>
				<div class="dashcontent">
					<a href="SearchBusForm.jsp">Search</a>
				</div>
			</div>
			<div class="odd ">		
				<div class="dashimg">
					<span class="glyphicon glyphicon-eye-open"></span>View Booking
				</div>
				<div class="dashcontent">
					<a href="GetBookingHistory.jsp">View</a>	
				</div>
			</div>
			</div>
			<div class="dashboarddiv ">
			<div class="even ">						
				<div class="dashimg">
					<!-- <img src="assets/img/4.png"/> -->
					<span class="glyphicon glyphicon-remove"></span>Cancel Ticket
				</div>
				<div class="dashcontent">
					<a href="CancelTicket.jsp">View</a>
				</div>
			</div>
			<div class="even ">
				<div class="dashimg">
				<span class="glyphicon glyphicon-off"></span>Logout
				</div>
				<div class="dashcontent">
					<a href="Logout.jsp">Logout</a>
				</div>			
			</div>
			</div>
		</div>
	</div>
</div>


<!-- ***********   basha html ends   *********** -->

<jsp:include page="layout/Footer.jsp" />






