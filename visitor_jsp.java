package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class visitor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("     <title>visitor Login</title>\n");
      out.write("    <style>\n");
      out.write("         /* General Styles */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Header */\n");
      out.write("        header {\n");
      out.write("            background-color: #fb860a;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navbar */\n");
      out.write("        .navbar {\n");
      out.write("            margin-bottom: 0;\n");
      out.write("            border-radius: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-inverse {\n");
      out.write("            background-color: #333;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-inverse .navbar-nav > li > a {\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-inverse .navbar-nav > li > a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Login Form */\n");
      out.write("        .login {\n");
      out.write("            width: 320px;\n");
      out.write("            background: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group {\n");
      out.write("            margin: 15px 0;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 2px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-hover {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-hover:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Responsive */\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .login {\n");
      out.write("                width: 90%;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <h1>Restraint Obsession</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("     <!--Navbar (Same as Registration Pages)--> \n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Restraint Obsession</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"./index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"./about.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"./contact.jsp\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Login <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"admin.jsp\">Admin</a></li>\n");
      out.write("                            <li><a href=\"doctor.jsp\">Doctor</a></li>\n");
      out.write("                            <li><a href=\"visitor.jsp\">Visitor</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("     <!--Visitor Login Form--> \n");
      out.write("    <div class=\"login\">\n");
      out.write("        <h2>Visitor Login</h2>\n");
      out.write("        <form action=\"visitor1.jsp\" method=\"post\"name=\"login\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <button class=\"btn-hover\">Login</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
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
