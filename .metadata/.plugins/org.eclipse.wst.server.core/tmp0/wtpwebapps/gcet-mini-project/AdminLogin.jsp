<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>

<!-- ***********   START   *********** -->
<div class="myWrapper">
	<div class="centerformWrapper">
		<div class="centertitle">
			Admin Login
		</div>
		<div class="errordiv">
			<!-- code to display error message  -->
			<%if(request.getParameter("msg")!=null){%>
				<h4><%=request.getParameter("msg") %></h4>	
			<%}%>
			<!-- error message code ends here -->
		</div>
		<div class="centerform">
			<form name="loginForm" action=LoginFormController onsubmit="return validateLogin2();" method="post">
						<div class="formgroup">
					<label for="username">UserName</label>
					<input type="text" name="username" class="formcontrol"/>
				</div>
				<div class="formgroup">
					<label for="password">Password</label>
					<input type="password" name="password" class="formcontrol"/>
				</div>		
				<div class="formgroup">
					<input type="hidden" name="type" value="admin"/>
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






