/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-20 17:40:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditBusDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Session validation for bus operator  -->\n");

	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("busoperator"))){
		response.sendRedirect("BusOperatorLogin.jsp");
	}

      out.write("\n");
      out.write("<!-- session validation ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ***********   START   *********** -->\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("	<div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("		<div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			EDIT BUS DETAILS\n");
      out.write("		</div>\n");
      out.write("		<div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("		\n");
      out.write("		<form name=\"EditBusDetailsForm\" action=\"EditBusDetailsFormController\"\n");
      out.write("				onsubmit=\"return validateLogin8();\" method=\"post\">\n");
      out.write("			\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"busname\">Enter Bus Name</label>\n");
      out.write("					<input type=\"text\" name=\"busname\" class=\"form-control\"/>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"bustype\">Enter Bus Type</label>\n");
      out.write("					<select class=\"form-control\" name=\"bustype\">\n");
      out.write("						<option value=\"AC\">AC</option>\n");
      out.write("						<option value=\"Non-AC\">NON-AC</option>\n");
      out.write("					</select>\n");
      out.write("					<label for=\"busname1\">  </label>\n");
      out.write("					<select class=\"form-control\" name=\"bustype1\">\n");
      out.write("						<option value=\"Non-Sleeper\">NonSleeper</option>\n");
      out.write("						<option value=\"Sleeper\">Sleeper</option>						\n");
      out.write("						<option value=\"Semi-Sleeper\">SemiSleeper</option>\n");
      out.write("					</select>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"departurecity\">Enter Departure City</label>\n");
      out.write("					<input type=\"text\" name=\"departurecity\" class=\"form-control\"/>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"arrivalcity\">Enter Arrival City</label>\n");
      out.write("					<input type=\"text\" name=\"arrivalcity\" class=\"form-control\"/>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"departuretime\">Enter Departure Time in 24-hr format(HH:MM)</label>\n");
      out.write("					<input type=\"text\" name=\"departuretime\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"traveltime\">Enter Travel Time in 24-hr format(HH:MM)</label>\n");
      out.write("					<input type=\"text\" name=\"traveltime\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"OperatingDays\">Enter Operating Days</label><br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Sunday\">Sunday<br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Monday\">Monday<br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Tuesday\">Tuesday<br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Wednesday\">Wednesday<br>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Thursday\">Thursday<br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Friday\">Friday<br/>\n");
      out.write("					<input type=\"checkbox\" name=\"OperatingDays\" value=\"Saturday\">Saturday<br>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"cost\">Cost of travel</label>\n");
      out.write("					<input type=\"text\" name=\"cost\" class=\"form-control\"/>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"noofseats\">Number of Seats</label>\n");
      out.write("					<input type=\"text\" name=\"noofseats\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<input type=\"submit\" class=\"btn btn-danger\" value=\"Edit\">\n");
      out.write("					<input type=\"reset\"  class=\"btn btn-danger\" value=\"Cancel\">\n");
      out.write("				</div>	\n");
      out.write("			</form>	\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<!-- ********************************* -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
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
