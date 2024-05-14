/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-05-14 00:54:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class PrintTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Express Bus Reservation System</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\"/>\r\n");
      out.write("        <!--  css links -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/dashboardStyle.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- javascript links -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/js/liquidmetal.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/js/query.flexselect.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/blank.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function openPage(pageURL)\r\n");
      out.write("            {\r\n");
      out.write("                window.location.href = pageURL;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        System.out.println("comming PrintTicket.jsp file");

        String ticketNO = request.getAttribute("ticketNO").toString();
        String bookingId = "";
        String busId = "";
        String travelDate = "";
        String travelTime = "";

        ResultSet rs = (ResultSet) request.getAttribute("ticket");
        if (rs != null) {
            while (rs.next()) {
                bookingId = rs.getString(1);
                System.out.println(bookingId);
                busId = rs.getString(2);
                System.out.println(busId);
                travelDate = rs.getString(4);
                System.out.println(travelDate);
                travelTime = rs.getString(5);
                System.out.println(travelTime);
            }
        }
        int numberOfset;
        int ticketPrice;
        int totalAmount;
        numberOfset = Integer.parseInt(request.getAttribute("noOfseats").toString());
        System.out.println(numberOfset);
        ticketPrice = Integer.parseInt(request.getAttribute("ticketPrice").toString());
        System.out.println(ticketPrice);

        totalAmount = ticketPrice * numberOfset;
        System.out.println(totalAmount);

    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body background=\"assets/img/bg.png\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 col-md-offset-9\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-md-offset-9\" style=\"padding-top: 20px;padding-bottom: 20px\">\r\n");
      out.write("                <div class=\"form-inline\">\r\n");
      out.write("                    <button class=\"btn btn-success\" onclick=\"javascript:window.print()\"><span class=\"glyphicon glyphicon-print\">&nbsp;&nbsp;</span>Print</button>\r\n");
      out.write("                    <button class=\"btn btn-success\" onclick=\"openPage('indexUser.jsp')\"><span class=\"glyphicon glyphicon-home\">&nbsp;&nbsp;</span>Home</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-md-offset-9\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-md-12 col-sm-12 col-xs-12  col-lg-offset-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--start tacket panal-->\r\n");
      out.write("                    <div class=\"panel panel-info\">\r\n");
      out.write("                        <!-- Default panel contents -->\r\n");
      out.write("                        <div class=\"panel-heading\"><label style=\"color: #aa9911; font-size: 35;\">Online Reservation</label></div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class = \"center-level\">\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">Ticket No &emsp;:</label>&emsp;\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">");
      out.print(ticketNO);
      out.write("</label><br/>\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">Booking Id &emsp;:</label>&emsp;\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">");
      out.print(bookingId);
      out.write("</label><br/>\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">Bus Id &emsp;:</label>&emsp;\r\n");
      out.write("                                <label style=\"color: #2b542c; font-size: 15;\">");
      out.print(busId);
      out.write("</label><br/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label style=\"color: #2b542c; font-size: 18;\">Travel Date &emsp;: &emsp; ");
      out.print(travelDate);
      out.write(" </label>\r\n");
      out.write("                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("                            <label style=\"color: #2b542c; font-size: 18;\">Time &emsp;: &emsp; ");
      out.print(travelTime);
      out.write("</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Table -->\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table\">\r\n");
      out.write("                                <tr class=\"warning\">\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">Ticket Price </label></td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">:</label>&emsp;</td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">");
      out.print(ticketPrice);
      out.write("</label></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr class=\"danger\">\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">Number Of Seat</label></td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">:</label></td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">");
      out.print(numberOfset);
      out.write("</label></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr class=\"success\">\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">Total Amount</label></td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">:</label></td>\r\n");
      out.write("                                    <td><label style=\"color: black; font-size: 18;\">");
      out.print(totalAmount);
      out.write("</label></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class = \"center-level\">\r\n");
      out.write("                                <p class=\"well\">\r\n");
      out.write("                                <label style=\"color: green; font-size: 22;font-style: italic\">Have a nice journey</label> \r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!--stop ticket-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
