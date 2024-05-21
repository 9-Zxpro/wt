<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.gcetminiwebproject.models.BusModel"%>
<%@page import="java.sql.ResultSet"%>

<!-- ***********   START   *********** -->
<jsp:include page="layout/Header.jsp" />

<!-- Session validation for bus operator  -->
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>

<div class="main-body" >
<jsp:include page="layout/UserSidebar.jsp" />
<div class="mymainWrapper">
    <div class="centerformWrapper ">
        <div class="centertitle ">
            SEARCH BUS
        </div>
        
        <div  class="errordiv ">
        <%
            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        %>
    </div>
        <div class="centerform ">
            <form name="SearchBusFormController" action="SearchBusFormController"
                  onsubmit="return validateLogin12();" method="post">
                <div class="formgroup">
                    <label for="from">From</label>
                    <select name="from" id="from" class="flexselect formcontrol">						
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
                    <select name="to" id="to" class="flexselect formcontrol">
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
                    <input class="formcontrol" type="text" name="date" />
                </div>
              <div class="formgroup buttoncenter">
                 <button type="submit" class="btn btnsuccess">Search</button>
                    <button type="reset" class="btn btnwarning">Reset</button>
                </div>
                    
                  
            </form>	
        </div>
    </div>
</div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />
