/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-19 07:32:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cognizant.model.*;
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
    _jspx_imports_packages.add("com.cognizant.model");
    _jspx_imports_packages.add("javax.servlet");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/UserSidebar.jsp", out, false);
      out.write("\n");
      out.write("<!-- ********  Start  *********** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

		ResultSet rs = null;
		UserModel um = new UserModel();
		um.setEmail(String.valueOf(session.getAttribute("userid")));
		rs = um.showUserBookings();
	
      out.write("\n");
      out.write("	\n");
      out.write("\n");
      out.write("	\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("	<div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("		<div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			Booking History\n");
      out.write("		</div>\n");
      out.write("		<div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			<table class =\"table table-bordered\">\n");
      out.write("				<tr>\n");
      out.write("					<td>booking ID</td>\n");
      out.write("					<td>BusId</td>\n");
      out.write("					<td>Date</td>\n");
      out.write("					<td>Time</td>\n");
      out.write("				</tr>\n");
      out.write("				");

					while(rs.next()){
				
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td>");
      out.print(rs.getString(1) );
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(3) );
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(4) );
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(5) );
      out.write("</td>\n");
      out.write("				</tr>\n");
      out.write("					");
} 
						rs.close();
					
      out.write("\n");
      out.write("			</table>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"centerformWrapper col-lg-5 col-md-5 col-sm-2 col-xs-2\">\n");
      out.write("		<div class=\"formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12\">Cancel Ticket</div>\n");
      out.write("		<div class=\"errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("		");

			if (request.getParameter("msg") != null) {
		
      out.write("\n");
      out.write("		<h4>");
      out.print(request.getParameter("msg"));
      out.write(" for booking ID ");
      out.print(request.getParameter("bid"));
      out.write("</h4>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("		</div>\n");
      out.write("		<div class=\"centerform col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			<form name=\"cancelTicket\" action=\"CancelTicketFormController\" method=\"post\">\n");
      out.write("				");
 
					HttpSession session1 = request.getSession();
					if(session1.getAttribute("userid")!=null){ 
				
      out.write("	\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"bookingid\">Enter the booking id</label>\n");
      out.write("					<input type=\"text\" name=\"bookingid\" class=\"form-control\">\n");
      out.write("				</div>		\n");
      out.write("				");
 } else { 
      out.write("\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"bookingid\">Enter the booking id</label>\n");
      out.write("					<input type=\"text\" name=\"bookingid\" class=\"form-control\">\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"username\">Enter your email</label>\n");
      out.write("					<input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("				</div>\n");
      out.write("				");
 } 
      out.write("\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<button type=\"submit\" name=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("				</div>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("<!-- ********************************* -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
