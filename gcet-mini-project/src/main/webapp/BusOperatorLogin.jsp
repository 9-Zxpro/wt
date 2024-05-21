<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<jsp:include page="layout/Header.jsp" />

<!-- ***********   START   *********** -->
<div class="myWrapper">
	<div class="centerformWrapper ">
		<div class="centertitle">
			Bus Operator Login
		</div>
		
		<div class="errordiv">
			<%if(request.getParameter("msg")!=null){%>
				<h4><%=request.getParameter("msg") %></h4>	
			<%}%>
		</div>
		
		<div class="centerform ">
		<form name="loginForm" action="LoginFormController" onsubmit="return validateLogin4();" method="post" >
			
				<div class="formgroup">
					<label for="username">Email</label>
					<input type="text" name="username" class="formcontrol"/>
				</div>
				<div class="formgroup">
					<label for="password">Password</label>
					<input type="password" name="password" class="formcontrol"/>
				</div>		
				<div class="formgroup">
					<input type="hidden" name="type" value="busoperator"/>
				</div>		
				<div class="formgroup buttoncenter">
					<input type="submit" class="btn btnsuccess" value="Submit"/>
					<input type="reset" class="btn btnwarning" value="Reset"/>
				</div>
			</form>			
		</div>
	</div>
</div>

<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />






