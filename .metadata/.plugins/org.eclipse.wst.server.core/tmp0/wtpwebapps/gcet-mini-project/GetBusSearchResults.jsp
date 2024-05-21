<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>

<jsp:include page="layout/Header.jsp" />

<!-- ***********   START   *********** -->
<div class="mymainWrapper">
    <div class="tableWrapper ">
        <div class="centertitle ">
            Search Results
        </div>
        <div class="tableContent ">
            <table class ="table tablebordered">
                <tr>
                    <td>Bus ID</td>
                    <td>Bus Name</td>
                    <td>Bus Type</td>
                    <td>Departure Time</td>
                    <td>Travel Time</td>
                    <td>From</td>
                    <td>To</td>
                    <td>Cost</td>
                    <td>Booking</td>
                </tr>
                <%
                    ResultSet rs = (ResultSet) request.getAttribute("busInformation");
                    try {
                        while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                    <td><%=rs.getString(7)%></td>
                    <td><%=rs.getString(8)%></td>
                    <td><a href="BookTicket.jsp?busid=<%=rs.getString(1)%>&date=<%=String.valueOf(request.getAttribute("Date"))%>">confirm</a></td>
                </tr>
                <%
                        }
                        rs.close();

                    } catch (Exception e) {

                    }
                %>
            </table>
        </div>
    </div>
</div>

<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />