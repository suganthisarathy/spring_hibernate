/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-31 09:18:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootstrap Example</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("/* Remove the navbar's default margin-bottom and rounded borders */\r\n");
      out.write(".navbar {\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tborder-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add a gray background color and some padding to the footer */\r\n");
      out.write("footer {\r\n");
      out.write("\tbackground-color: #f2f2f2;\r\n");
      out.write("\tpadding: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".inner-addon {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* style icon */\r\n");
      out.write(".inner-addon .glyphicon {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tpointer-events: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Add styles to the form container */\r\n");
      out.write(".form-container {\r\n");
      out.write("\tmax-width: 100%;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("/* Add some hover effects to buttons */\r\n");
      out.write(".form-container .btn:hover, .open-button:hover {\r\n");
      out.write("\topacity: 1;\r\n");
      out.write("}\r\n");
      out.write("/* align icon */\r\n");
      out.write(".left-addon .glyphicon {\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right-addon .glyphicon {\r\n");
      out.write("\tright: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* add padding  */\r\n");
      out.write(".left-addon input {\r\n");
      out.write("\tpadding-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right-addon input {\r\n");
      out.write("\tpadding-right: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container \">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\" style=\"color: white\">OLX</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"navbar-form navbar-left\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"inner-addon left-addon\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i> <label\r\n");
      out.write("\t\t\t\t\t\t\tfor=\"focusedInput\"></label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"navbar-form navbar-right\">\r\n");
      out.write("                       <form action=\"/olx_resale/index\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-info\">\r\n");
      out.write("              <span class=\"glyphicon glyphicon-log-out\"></span> Logout</button> </form> </ul>\r\n");
      out.write("             <ul class=\"navbar-form navbar-right\">\r\n");
      out.write("                <form action=\"/olx_resale/cart\"> <button type=\"submit\" class=\"btn btn-info\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-shopping-cart\"></span>Cart</button> </form></ul>\r\n");
      out.write("                <ul class=\"navbar-form navbar-right\">\r\n");
      out.write("                 <form action=\"/olx_resale/list\"><button type=\"submit\" class=\"btn btn-info\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-camera\"></span> Myads</button> </form></ul>\r\n");
      out.write("                <ul class=\"navbar-form navbar-right\">\r\n");
      out.write("                 <form action=\"/olx_resale/sell\"><button type=\"submit\" class=\"btn btn-info\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-camera\"></span> Sell</button> </form></ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
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
