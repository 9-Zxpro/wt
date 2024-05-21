/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-19 07:33:12 UTC
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

public final class SearchBusForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- ***********   START   *********** -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/UserSidebar.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\n");
      out.write("<!-- Session validation for bus operator  -->\n");

    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("<!-- session validation ends -->\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\"style=\"padding-top: 50px\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            SEARCH BUS\n");
      out.write("        </div>\n");
      out.write("        ");

            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        
      out.write("\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"SearchBusFormController\" action=\"SearchBusFormController\"\n");
      out.write("                  onsubmit=\"return validateLogin12();\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"from\">From</label>\n");
      out.write("                    <select name=\"from\" id=\"from\" class=\"flexselect form-control\">						\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        ");

                            BusModel model = new BusModel();
                            ResultSet rs = model.getBusInfo1(1);

                            while (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1).toUpperCase());
      out.write("</option>\n");
      out.write("                        ");
} 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"to\">To</label>\n");
      out.write("                    <select name=\"to\" id=\"to\" class=\"flexselect form-control\">\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        ");

                            ResultSet rs1 = model.getBusInfo1(2);

                            while (rs1.next()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs1.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(1).toUpperCase());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("	\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"from\">Date</label>\n");
      out.write("                    <input class=\"tcal\" type=\"text\" name=\"date\" />\n");
      out.write("                </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                 &emsp;&emsp;&emsp; <button type=\"submit\" class=\"btn btn-success\">Search</button>&emsp;&emsp;&emsp;\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-warning\">Reset</button>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("            </form>	\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
