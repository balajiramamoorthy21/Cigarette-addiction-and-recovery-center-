package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class doctor_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    // Debugging start
    System.out.println("Doctor Profile JSP Loaded");

    // Get session email
    HttpSession userSession = request.getSession();
    String email = (String) userSession.getAttribute("user");

    if (email == null) {
        response.sendRedirect("doctor.jsp"); // Redirect if not logged in
        return;
    }

    int doctorId = 0;
    String name = "", phone = "", specialization = "", profilePhoto = "default.jpg";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rb", "root", "");
        System.out.println("Database Connected Successfully");

        // Get doctor details using email
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM doctors WHERE email = ?");
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            doctorId = rs.getInt("id");
            name = rs.getString("name");
            phone = rs.getString("phone");
            specialization = rs.getString("specialization");
            profilePhoto = rs.getString("profile_photo") != null ? rs.getString("profile_photo") : "default.jpg";
            System.out.println("Doctor Data Fetched: " + name);
        } else {
            System.out.println("No doctor found for email: " + email);
        }
        conn.close();
    } catch (Exception e) {
        System.out.println("Database Error: " + e.getMessage());
        e.printStackTrace();
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Doctor Profile</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            margin: 0;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("        }\n");
      out.write("        .content {\n");
      out.write("            margin-left: 250px; /* Matches sidebar width */\n");
      out.write("            padding: 20px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .profile-card {\n");
      out.write("            max-width: 500px;\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "doctor_dashboard.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Profile Section -->\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2>Doctor Profile</h2>\n");
      out.write("        <div class=\"profile-card\">\n");
      out.write("            <img src=\"uploads/");
      out.print( profilePhoto );
      out.write("\" alt=\"Profile Photo\" width=\"150\">\n");
      out.write("            <h4>");
      out.print( name );
      out.write("</h4>\n");
      out.write("            <p><strong>Specialization:</strong> ");
      out.print( specialization );
      out.write("</p>\n");
      out.write("            <p><strong>Phone:</strong> ");
      out.print( phone );
      out.write("</p>\n");
      out.write("            \n");
      out.write("            <!-- Change Profile Button -->\n");
      out.write("            <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#editProfileModal\">Edit Profile</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Modal for Editing Profile -->\n");
      out.write("    <div id=\"editProfileModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h4 class=\"modal-title\">Edit Profile</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"DoctorProfileServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                        <input type=\"hidden\" name=\"doctorId\" value=\"");
      out.print( doctorId );
      out.write("\">\n");
      out.write("                        <label>Full Name:</label>\n");
      out.write("                        <input type=\"text\" name=\"name\" value=\"");
      out.print( name );
      out.write("\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("                        <label>Phone:</label>\n");
      out.write("                        <input type=\"text\" name=\"phone\" value=\"");
      out.print( phone );
      out.write("\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("                        <label>Specialization:</label>\n");
      out.write("                        <input type=\"text\" name=\"specialization\" value=\"");
      out.print( specialization );
      out.write("\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("                        <label>Change Profile Photo:</label>\n");
      out.write("                        <input type=\"file\" name=\"photo\" class=\"form-control\">\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Save Changes</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
