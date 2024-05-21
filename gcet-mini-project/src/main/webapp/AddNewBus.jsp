<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.gcetminiwebproject.models.BusModel"%>
<%@page import="java.sql.ResultSet"%>

<!-- Session validation for bus operator  -->
<%
	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("busoperator"))){
		response.sendRedirect("BusOperatorLogin.jsp");
	}
%>
<!-- session validation ends -->

<jsp:include page="layout/Header.jsp" />
<!-- ***********   START   *********** -->

<div class="main-body" >

<div class="left-column ">
	<ul>
		<li><a href="AddNewBus.jsp">Add new bus</a>
		</li>
		<li><a href="GetAddedBuses.jsp">Show buses</a>
		</li>
		<li><a href="Logout.jsp">Logout</a>
		</li>
	</ul>
</div>


<div class="mymainWrapper">
	<div class="centerformWrapper">
		<div class="centertitle">
			Add new bus
		</div>


		<div class="errordiv ">
			<%
				if (request.getParameter("msg") != null) {
			%>
			<h4><%=request.getParameter("msg")%></h4>
			<%
				}
			%>
		</div>


		<div class="centerform ">
			<form name="myForm" action="AddNewBusController"
				onsubmit="return validateLogin();" method="post">
				<div class="formgroup">
					<label for="busname">Enter Bus Name</label> <input type="text"
						name="busname" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="bustype">Enter Bus Type</label> 
					<select name="bustype1" class="formcontrol" style = "margin-bottom: 10px;">
						<option Value="AC">AC</option>
						<option Value="Non-AC">Non-AC</option>
					</select>
					
					 <label for="bustype2"> </label>
					 <select name="bustype2"
						class="formcontrol">
						<option Value="Non-Sleeper">NonSleeper</option>
						<option Value="Sleeper">Sleeper</option>
						<option Value="Semi-Sleeper">SemiSleeper</option>
					</select>
				</div>
				<div class="formgroup">
					<label for="departurecity">Enter Departure City </label> <input
						type="text" name="departurecity" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="arrivalcity">Enter Arrival City </label> <input
						type="text" name="arrivalcity" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="departuretime">Enter Departure Time in 24Hr
						format</label> <input type="text" name="departuretime"
						class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="traveltime">Enter Travel Time in 24-hr
						format(HH:MM) </label> <input type="text" name="traveltime"
						class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="operatingdays">Enter Operating Days </label><br /> <input
						type="checkbox" name="OperatingDays1" value="S" checked>Sunday<br />
					<input type="checkbox" name="OperatingDays2" value="M">Monday<br />
					<input type="checkbox" name="OperatingDays3" value="T">Tuesday<br />
					<input type="checkbox" name="OperatingDays4" value="W">Wednesday<br />
					<input type="checkbox" name="OperatingDays5" value="T">Thursday<br />
					<input type="checkbox" name="OperatingDays6" value="F">Friday<br />
					<input type="checkbox" name="OperatingDays7" value="S">Saturday<br />
				</div>
				<div class="formgroup">
					<label for="cost">Cost of travel</label> <input type="text"
						name="cost" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="Number of Seats">Number of Seats </label> <input
						type="text" name="seats" class="formcontrol" />
				</div>
				<div class="formgroup">
					<input type="submit" class="btn btnsuccess" value="Add" style="float:left;" /> 
					<input type="reset" class="btn btndanger" value="Cancel" style="float:right;" />
				</div>
			</form>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />
