package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class visireg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta property=\"og:image\" name=\"image\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Visitor Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        /* Header */\n");
      out.write("        header {\n");
      out.write("            background-color: #fb860a;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .navbar {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            border-radius: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 500px;\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-top: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input, select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background: #28a745;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background: #218838;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Restraint Obsession</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Recovery Center</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"docreg.jsp\">Doctor Registration</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"reg.jsp\">Visitor Registration</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Visitor Registration</h2>\n");
      out.write("        <form action=\"./addvisitor.jsp\" method=\"POST\">\n");
      out.write("            <label for=\"name\">Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"dob\">Date of Birth</label>\n");
      out.write("            <input type=\"date\" id=\"dob\" name=\"dob\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"gender\">Gender</label>\n");
      out.write("            <select id=\"gender\" name=\"gender\">\n");
      out.write("                <option disabled selected> Gender</option>\n");
      out.write("                <option value=\"male\">Male</option>\n");
      out.write("                <option value=\"female\">Female</option>\n");
      out.write("                <option value=\"other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("            <label for=\"phone\">Phone Number</label>\n");
      out.write("            <input type=\"text\" id=\"phone\" name=\"phone\" required>\n");
      out.write("            \n");
      out.write("             <label for=\"address\">Address </label>\n");
      out.write("            <input type=\"text\" id=\"address\" name=\"address\" required>\n");
      out.write("\n");
      out.write("            <label for=\"reason\">Reason for Visit</label>\n");
      out.write("            <input type=\"text\" id=\"reason\" name=\"reason\" required>\n");
      out.write("\n");
      out.write("            <label for=\"date\">Preferred Date of Visit</label>\n");
      out.write("            <input type=\"date\" id=\"visit_date\" name=\"visit_date\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"password\">Create Password</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Register</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
