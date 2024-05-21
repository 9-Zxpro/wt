<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.gcetminiwebproject.models.BusModel" %>




<script>
    $(document).ready(function () {
        $("select.flexselect").flexselect();
    });
</script>

<!--for calender-->
<script>
    jQuery(function () {
        jQuery("#inf_custom_someDateField").datepicker();
    });
</script>

<script type="text/javascript">
    document.onkeydown = function (event) {

        if (!event) { /* This will happen in IE */
            event = window.event;
        }

        var keyCode = event.keyCode;

        if (keyCode == 8 &&
                ((event.target || event.srcElement).tagName != "TEXTAREA") &&
                ((event.target || event.srcElement).tagName != "INPUT")) {

            if (navigator.userAgent.toLowerCase().indexOf("msie") == -1) {
                event.stopPropagation();
            } else {
                alert("prevented");
                event.returnValue = false;
            }

            return false;
        }
    };
</script>





<jsp:include page="layout/Header.jsp" />
<div  class="errordiv ">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4 style="color:black;"><%=request.getParameter("msg")%></h4>
        <%
            }
        %>
    </div>

<!-- ***********   START   *********** -->

<!--show message coming from java class-->
<div class="myWrapper ">

    <!--searching bus-->
    <div class="leftWrapper ">
        <div class="centertitle">
            CHOOSE YOUR DESTINATION</div>
        <div class="col-lg-offset-2">
            <form name="SearchBusFormController" action="SearchBusFormController"
                  onsubmit="return validateLogin12();" method="post">

                <div class="formgroup ">
                    <label for="from">From</label>
                    <select name="from" id="from" class="formcontrol">						
                        <option value=""></option>
                        <%
                            BusModel model = new BusModel();
                            ResultSet rs = model.getBusInfo1(1);

                            while (rs.next()) {%>

                        <option value="<%=rs.getString(1)%>"><%=rs.getString(1).toUpperCase()%></option>
                        <%} %>
                    </select>

                </div>
                <div class="formgroup">
                    <label for="to">To</label>
                    <select name="to" id="to" class="formcontrol">
                        <option value=""></option>
                        <%
                            ResultSet rs1 = model.getBusInfo1(2);

                            while (rs1.next()) {%>
                        <option value="<%=rs1.getString(1)%>"><%=rs1.getString(1).toUpperCase()%></option>
                        <%}%>
                    </select>
                </div>
                <div class="formgroup ">
                    <label for="from">Date</label>
                    <!-- <input type="text"
                            class="formcontrol" id="date" name="date"> -->
                    <input class="tcal formcontrol" type="text" name="date" />
                </div>
                <div class="formgroup buttoncenter">
                    <button type="submit" class="btn btnsuccess ">Search Buses</button>
                    <button type="reset" class="btn btnwarning ">Clear</button>
                </div>
            </form>
        </div>
    </div>
    <!--  End of left wrapper -->



    <!--Login Part-->
    <div class="rightWrapper">
        <div class="centertitle">
            LOGIN</div>
        <div class="">
            <form name="LoginFormController" action="LoginFormController"
                  onsubmit="return validateLogin13();" method="post">

                <div class="formgroup">
                    <label for="from">Email</label> <input type="text" id="email"
                                                           class="formcontrol text required email" id="email"
                                                           name="username">
                </div>
                <div class="formgroup">
                    <label for="password">Password</label> <input type="password"
                                                                  class="formcontrol" id="password" name="password">
                </div>
                <div class="formgroup">
                    <input type="hidden" name="type" value="user" />
                </div>
                <div class="formgroup buttoncenter">
                    <button type="submit" class="btn btnsuccess">Login</button>
                    <button type="reset" class="btn btnwarning">Clear</button>
                </div>
            </form>

        </div>

        <div class="logOptions">
            <a href="BusOperatorLogin.jsp">Bus Operator Login</a> <span> | </span> <a href="RegisterUser.jsp"> User Sign up</a> <span>|</span> <a href="AdminLogin.jsp">Admin Login</a>
        </div>

    </div>
</div>
<jsp:include page="layout/Footer.jsp" />
