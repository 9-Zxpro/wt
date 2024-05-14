<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.gcetminiwebproject.models.BusModel"%>
<%@page import="java.sql.ResultSet"%>

<!-- ***********   START   *********** -->
<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>



<div class="myWrapper">
    <div class="centerformWrapper">
        <div class="centertitle ">
            REGISTER FORM
        </div>
        <div class="errordiv">
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg);
                }
            %>
        </div>


        <!--User Registration-->
        <div class="centerform">
            <form name="RegisterUserController" action="RegisterUserController"
                  onsubmit="return validateLogin15();" method="post">


                <div class="formgroup">
                    <label for="username">Email ID</label> 
                    <input type="text" name="username" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="password">Password</label> 
                    <input type="password" name="password" placeholder="at least 5 character" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="confirmPassword">Confirm Password</label> 
                    <input type="password" name="confirmPassword" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="fName">First Name</label> 
                    <input type="text" name="fName" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="lName">Last Name</label> 
                    <input type="text" name="lName" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="city">City</label> 
                    <input type="text" name="city" class="formcontrol"/>
                </div>
                <div class="formgroup">
                    <label for="address">Address</label> 
                    <textarea name="address" class="formcontrol" rows="3"></textarea>
                </div>
                <div class="formgroup">
                    <label for="phoneNumber">Phone Number</label> 
                    <input type="text" name="phoneNumber" class="formcontrol"/>
                </div>
                <div class="formgroup buttoncenter">
                   <button type="submit" class="btnsuccess">Submit</button>
                    <button type="reset" class="btn btnwarning">Reset</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />