/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-20 17:16:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cognizant.model.BusModel;
import java.sql.ResultSet;

public final class AddNewBus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.cognizant.model.BusModel");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Session validation for bus operator  -->\n");

	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("busoperator"))){
		response.sendRedirect("BusOperatorLogin.jsp");
	}

      out.write("\n");
      out.write("<!-- session validation ends -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/blank.js\"></script>\n");
      out.write("<!-- ***********   START   *********** -->\n");
      out.write("<div class=\"left-column col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("	<ul>\n");
      out.write("		<li><a href=\"AddNewBus.jsp\">Add new bus</a>\n");
      out.write("		</li>\n");
      out.write("		<li><a href=\"GetAddedBuses.jsp\">Show buses</a>\n");
      out.write("		</li>\n");
      out.write("		<li><a href=\"EditProfile.jsp\">Edit profile</a>\n");
      out.write("		</li>\n");
      out.write("		<li><a href=\"ChangePassword.jsp\">Change Password</a>\n");
      out.write("		</li>\n");
      out.write("		<li><a href=\"DeleteBusOperator.jsp\">Delete account</a>\n");
      out.write("		</li>\n");
      out.write("		<li><a href=\"Logout.jsp\">Logout</a>\n");
      out.write("		</li>\n");
      out.write("	</ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("	<div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("		<div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			Add new bus</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("		<div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("			");

				if (request.getParameter("msg") != null) {
			
      out.write("\n");
      out.write("			<h4>");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("			");

				}
			
      out.write("\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("		<div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("			<form name=\"myForm\" action=\"AddNewBusFormController\"\n");
      out.write("				onsubmit=\"return validateLogin();\" method=\"post\">\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"busname\">Enter Bus Name</label> <input type=\"text\"\n");
      out.write("						name=\"busname\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"bustype\">Enter Bus Type</label> <select name=\"bustype1\"\n");
      out.write("						class=\"form-control\">\n");
      out.write("						<option Value=\"AC\">AC</option>\n");
      out.write("						<option Value=\"Non-AC\">Non-AC</option>\n");
      out.write("					</select> <label for=\"bustype2\"> </label> <select name=\"bustype2\"\n");
      out.write("						class=\"form-control\">\n");
      out.write("						<option Value=\"Non-Sleeper\">NonSleeper</option>\n");
      out.write("						<option Value=\"Sleeper\">Sleeper</option>\n");
      out.write("						<option Value=\"Semi-Sleeper\">SemiSleeper</option>\n");
      out.write("					</select>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"departurecity\">Enter Departure City </label> <input\n");
      out.write("						type=\"text\" name=\"departurecity\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"arrivalcity\">Enter Arrival City </label> <input\n");
      out.write("						type=\"text\" name=\"arrivalcity\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"departuretime\">Enter Departure Time in 24Hr\n");
      out.write("						format</label> <input type=\"text\" name=\"departuretime\"\n");
      out.write("						class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"traveltime\">Enter Travel Time in 24-hr\n");
      out.write("						format(HH:MM) </label> <input type=\"text\" name=\"traveltime\"\n");
      out.write("						class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"operatingdays\">Enter Operating Days </label><br /> <input\n");
      out.write("						type=\"checkbox\" name=\"OperatingDays1\" value=\"S\" checked>Sunday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays2\" value=\"M\">Monday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays3\" value=\"T\">Tuesday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays4\" value=\"W\">Wednesday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays5\" value=\"T\">Thursday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays6\" value=\"F\">Friday<br />\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays7\" value=\"S\">Saturday<br />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"cost\">Cost of travel</label> <input type=\"text\"\n");
      out.write("						name=\"cost\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"Number of Seats\">Number of Seats </label> <input\n");
      out.write("						type=\"text\" name=\"seats\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<input type=\"submit\" class=\"btn btn-danger\" value=\"Add\" /> <input\n");
      out.write("						type=\"reset\" class=\"btn btn-danger\" value=\"Cancel\" />\n");
      out.write("				</div>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<!-- ********************************* -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
      out.write('\n');
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
