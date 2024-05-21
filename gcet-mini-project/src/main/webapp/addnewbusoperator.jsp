<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>

<div class="main-body" >
<jsp:include page="layout/AdminSidebar.jsp" />

<div class="mymainWrapper">
	<div class="centerformWrapper">
		<div class="centertitle">
			<!-- code to display error message  -->
			<%-- <%if(request.getParameter("msg")!=null){%>
				<h4><%=request.getParameter("msg") %></h4>	
			<%}%> --%>
			<!-- error message code ends here -->			
			ADD NEW BUS OPERATOR
		</div>
		<div  class="errordiv ">
        <%
            if(request.getParameter("msg")!=null){%>
			<%=request.getParameter("msg") %>	
		<%}
        %>
    </div>
    
		<div class="centerform">
			<form name="AddNewBusOperatorFormController" action="AddNewBusOperatorFormController" onsubmit="return validateLogin1();" method="post">
				<div class="formgroup">
					<label for="busoperatorname">Enter Bus Operator Name</label>
					<input type="text" name="busoperatorname" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="email">Enter Bus Operator Email</label>
					<input type="text" name="email" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="address">Enter Address</label> 
					<input type="text" name="address" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="city">Enter City</label> 
					<input type="text" name="city" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="phonenumber">Enter Phone Number</label>
					<input type="text" name="phonenumber" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="password">Enter Password</label>
					<input type="text" name="password" class="formcontrol" />
				</div>
				<div class="formgroup">
					<label for="password">Re-enter Password</label>
					<input type="text" name="newpassword" class="formcontrol" />
				</div>
				<div class="formgroup buttoncenter">
					<input type="submit" class="btn btnsuccess" value="Submit" />
					<input type="reset" class="btn btndanger" value="Reset" />
				</div>
			</form>
		</div>
	</div>
</div>
</div>
<jsp:include page="layout/Footer.jsp" />