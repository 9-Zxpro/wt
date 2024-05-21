/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-19 06:36:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cognizant.model.AdminModel;
import java.sql.ResultSet;
import com.cognizant.model.UserModel;

public final class ViewBusOperators_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("com.cognizant.model.AdminModel");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.cognizant.model.UserModel");
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

	if (session.getAttribute("type") == null) {
		response.sendRedirect("AdminLogin.jsp");
	}

      out.write("\n");
      out.write("<!-- session validation ends -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/AdminSidebar.jsp", out, false);
      out.write("\n");
      out.write("<!-- ***********   START   *********** -->\n");

	ResultSet rs = null;
	AdminModel am = new AdminModel();
	am.setUserid(String.valueOf(session.getAttribute("userid")));
	rs = am.showAllBusOperators();

      out.write("\n");
      out.write("<div class=\"mymainWrapper \">\n");
      out.write("	<div class=\"tableWrapper \">\n");
      out.write("		<div class=\"centertitle \">\n");
      out.write("			Bus Operators</div>\n");
      out.write("		<div class=\"tableContent \">\n");
      out.write("			<table class=\"table tablebordered\">\n");
      out.write("				<tr>\n");
      out.write("					<td>Operator ID</td>\n");
      out.write("					<td>Operator Name</td>\n");
      out.write("					<td>Address</td>\n");
      out.write("					<td>EMail</td>\n");
      out.write("					<td>City</td>\n");
      out.write("					<td>Phone Number</td>\n");
      out.write("					<td>Password</td>\n");
      out.write("				</tr>\n");
      out.write("				");

					while (rs.next()) {
				
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("				</tr>\n");
      out.write("				");

					}
					rs.close();
				
      out.write("\n");
      out.write("			</table>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<!-- ********************************* -->\n");
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
