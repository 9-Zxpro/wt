/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-19 06:37:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnewbusoperator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('	');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/AdminSidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("	<div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("		<div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			<!-- code to display error message  -->\n");
      out.write("			");
if(request.getParameter("msg")!=null){
      out.write("\n");
      out.write("				<h4>");
      out.print(request.getParameter("msg") );
      out.write("</h4>	\n");
      out.write("			");
}
      out.write("\n");
      out.write("			<!-- error message code ends here -->			\n");
      out.write("			ADD NEW BUS OPERATOR\n");
      out.write("		</div>\n");
      out.write("		<div class=\"centerform col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("			<form name=\"AddNewBusOperatorFormController\" action=\"AddNewBusOperatorFormController\" onsubmit=\"return validateLogin1();\" method=\"post\">\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"busoperatorname\">Enter Bus Operator Name</label>\n");
      out.write("					<input type=\"text\" name=\"busoperatorname\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"email\">Enter Bus Operator Email</label>\n");
      out.write("					<input type=\"text\" name=\"email\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"address\">Enter Address</label> \n");
      out.write("					<input type=\"text\" name=\"address\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"city\">Enter City</label> \n");
      out.write("					<input type=\"text\" name=\"city\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"phonenumber\">Enter Phone Number</label>\n");
      out.write("					<input type=\"text\" name=\"phonenumber\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"password\">Enter Password</label>\n");
      out.write("					<input type=\"text\" name=\"password\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<label for=\"password\">Re-enter Password</label>\n");
      out.write("					<input type=\"text\" name=\"newpassword\" class=\"form-control\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"form-group\">\n");
      out.write("					<input type=\"submit\" class=\"btn btn-danger\" value=\"Submit\" />\n");
      out.write("					<input type=\"reset\" class=\"btn btn-danger\" value=\"Reset\" />\n");
      out.write("				</div>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
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
