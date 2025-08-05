package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class docreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor Registration Page</title>\n");
      out.write("        <style>\n");
      out.write("         body {\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            font-family: Arial, sans-serif;\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Recovery Center</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"docreg.jsp\">Doctor Registration</a></li>\n");
      out.write("                <li><a href=\"visireg.jsp\">Visitor Registration</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Doctor Registration</h2>\n");
      out.write("        <form action=\"Adddoctor\" method=\"Post\" enctype=\"multipart/form-data\">\n");
      out.write("            <label for=\"name\">Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("            \n");
      out.write("             <label for=\"gender\">Gender</label>\n");
      out.write("            <select id=\"gender\" name=\"gender\">\n");
      out.write("                 <option disabled selected> Gender</option>\n");
      out.write("                <option value=\"male\">Male</option>\n");
      out.write("                <option value=\"female\">Female</option> \n");
      out.write("                <option value=\"other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("            <label for=\"phone\">Phone Number</label>\n");
      out.write("            <input type=\"text\" id=\"phone\" name=\"phone\" required>\n");
      out.write("\n");
      out.write("            <label for=\"license\">Medical License Number</label>\n");
      out.write("            <input type=\"text\" id=\"license\" name=\"license\" required>\n");
      out.write("\n");
      out.write("            <label for=\"specialization\">Specialization</label>\n");
      out.write("            <select id=\"specialization\" name=\"specialization\">\n");
      out.write("                 <option disabled selected> Specialization</option>\n");
      out.write("                <option value=\"Addiction Counselor\">Addiction Counselor</option>\n");
      out.write("                <option value=\"Psychologist\">Psychologist</option>\n");
      out.write("                <option value=\"Psychiatrist\">Psychiatrist</option>\n");
      out.write("                <option value=\"Rehabilitation Therapist\">Rehabilitation Therapist</option>\n");
      out.write("                <option value=\"Mental Health Coach\">Mental Health Coach</option>\n");
      out.write("                <option value=\"Other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"experience\">Years of Experience</label>\n");
      out.write("            <input type=\"number\" id=\"experience\" name=\"experience\" min=\"0\" value=\"0\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <label for=\"address\">Address </label>\n");
      out.write("            <input type=\"text\" id=\"address\" name=\"address\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"workplace\">Current Workplace Address </label>\n");
      out.write("            <input type=\"text\" id=\"workplace\" name=\"workplace\" required>\n");
      out.write("            \n");
      out.write("             <label for=\"employee\">Employee Type</label>\n");
      out.write("            <select id=\"employee\" name=\"employee\" required>\n");
      out.write("            <option disabled selected>Work type</option>\n");
      out.write("            <option value=\"Hospital\">Hospital</option>\n");
      out.write("            <option value=\"Clinic\">Clinic</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("             \n");
      out.write("             <label for=\"hospital\">Name of the hospital/clinic </label>\n");
      out.write("            <input type=\"text\" id=\"hospital_name\" name=\"hospital\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"consultation\">Consultation Type</label>\n");
      out.write("            <select id=\"consultation\" name=\"consultation\">\n");
      out.write("                 <option disabled selected> Select one</option>\n");
      out.write("                <option value=\"Online\">Online</option>\n");
      out.write("                <option value=\"Offline\">Offline</option>\n");
      out.write("                <option value=\"Both\">Both</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"id_proof\">Upload ID Proof (PDF/Image)</label>\n");
      out.write("            <input type=\"file\" id=\"id_proof\" name=\"id_proof\" accept=\".pdf,.jpg,.png\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"license_proof\">Upload Medical License(PDF/Image)</label>\n");
      out.write("            <input type=\"file\" id=\"license_proof\" name=\"license_proof\" accept=\".pdf,.jpg,.png\" required>\n");
      out.write("\n");
      out.write("            <label for=\"password\">Create Password</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Register</button>\n");
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
