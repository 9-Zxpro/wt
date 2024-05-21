/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-19 07:28:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gcetminiwebproject.models.*;
import java.sql.ResultSet;

public final class CancelTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.gcetminiwebproject.models");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\r\n");
      out.write("<!-- ********  Start  *********** -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

		ResultSet rs = null;
		UserModel um = new UserModel();
		um.setEmail(String.valueOf(session.getAttribute("userid")));
		rs = um.showUserBookings();
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<div class=\"main-body\" >\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/UserSidebar.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"mymainWrapper myWindow\">\r\n");
      out.write("<div class=\"commonWindow\">\r\n");
      out.write("	<div class=\"tableWrapper\">\r\n");
      out.write("		<div class=\"centertitle row\">\r\n");
      out.write("			Booking History\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"tableContent \">\r\n");
      out.write("			<table class =\"table tablebordered\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>booking ID</th>\r\n");
      out.write("					<th>BusId</th>\r\n");
      out.write("					<th>Date</th>\r\n");
      out.write("					<th>Time</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

					while(rs.next()){
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(rs.getString(1) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(rs.getString(5) );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("					");
} 
						rs.close();
					
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"centerformWrapper\">\r\n");
      out.write("		<div class=\"formTitle \">Cancel Ticket</div>\r\n");
      out.write("		<div class=\"errordiv \">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		");

                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg +" for booking ID " + request.getParameter("bid"));
                }
            
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"centerform \">\r\n");
      out.write("			<form name=\"cancelTicket\" action=\"CancelTicketController\" method=\"post\">\r\n");
      out.write("				");
 
					HttpSession session1 = request.getSession();
					if(session1.getAttribute("userid")!=null){ 
				
      out.write("	\r\n");
      out.write("				<div class=\"formgroup\">\r\n");
      out.write("					<label for=\"bookingid\">Enter the booking id</label>\r\n");
      out.write("					<input type=\"text\" name=\"bookingid\" class=\"formcontrol\">\r\n");
      out.write("				</div>		\r\n");
      out.write("				");
 } else { 
      out.write("\r\n");
      out.write("				<div class=\"formgroup\">\r\n");
      out.write("					<label for=\"bookingid\">Enter the booking id</label>\r\n");
      out.write("					<input type=\"text\" name=\"bookingid\" class=\"formcontrol\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"formgroup\">\r\n");
      out.write("					<label for=\"username\">Enter your email</label>\r\n");
      out.write("					<input type=\"text\" name=\"email\" class=\"formcontrol\">\r\n");
      out.write("				</div>\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("				<div class=\"formgroup\">\r\n");
      out.write("					<button type=\"submit\" name=\"submit\" class=\"btn btndanger\">Submit</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<!-- ********************************* -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
