package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewvisiter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>View Visitors</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 style=\"text-align:center;color:blue;\">Assigned Visitors</h2>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <tr bgcolor=\"lightblue\">\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Age</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Phone</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Reason for Visit</th>\n");
      out.write("                <th>Visit Date</th>\n");
      out.write("                <th>Hospital</th>\n");
      out.write("                <th>Workplace</th>\n");
      out.write("                <th>Set Appointment</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                int doctorId = (Integer) session.getAttribute("doctor_id");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rb", "root", "");
                    
                    String sql = "SELECT b.*, d.hospital, d.workplace FROM book_appointment b " +
                                 "INNER JOIN doctors d ON b.doctor_id = d.id WHERE b.doctor_id = ? AND b.status = 'pending'";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, doctorId);
                    ResultSet rs = pst.executeQuery();
                    
                    while (rs.next()) {
            
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getInt("age") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("gender") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("phone") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("address") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("reason") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("visit_date") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("hospital") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("workplace") );
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"btn btn-primary set-appointment-btn\" \n");
      out.write("                                    data-id=\"");
      out.print( rs.getInt("id") );
      out.write("\" \n");
      out.write("                                    data-hospital=\"");
      out.print( rs.getString("hospital") );
      out.write("\" \n");
      out.write("                                    data-workplace=\"");
      out.print( rs.getString("workplace") );
      out.write("\"\n");
      out.write("                                    data-toggle=\"modal\" \n");
      out.write("                                    data-target=\"#confirmAppointmentModal\">\n");
      out.write("                                    Confirm\n");
      out.write("                                </button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("            ");

                    }
                    con.close();
                } catch (Exception e) {
                    out.print("<tr><td colspan='10' style='color:red; text-align:center;'>Error: " + e.getMessage() + "</td></tr>");
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Modal for Confirming Appointment -->\n");
      out.write("    <div id=\"confirmAppointmentModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h4 class=\"modal-title\">Confirm Appointment</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"confirm_booking.jsp\" method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" name=\"appointment_id\" id=\"appointmentId\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Hospital Name:</label>\n");
      out.write("                            <input type=\"text\" id=\"hospitalName\" class=\"form-control\" name=\"hospital\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Workplace (Address):</label>\n");
      out.write("                            <input type=\"text\" id=\"workplace\" class=\"form-control\" name=\"workplace\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Appointment Time:</label>\n");
      out.write("                            <input type=\"time\" class=\"form-control\" name=\"appointment_time\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Confirm Booking</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\".set-appointment-btn\").click(function () {\n");
      out.write("                var appointmentId = $(this).data(\"id\");\n");
      out.write("                var hospitalName = $(this).data(\"hospital\");\n");
      out.write("                var workplace = $(this).data(\"workplace\");\n");
      out.write("                \n");
      out.write("                $(\"#appointmentId\").val(appointmentId);\n");
      out.write("                $(\"#hospitalName\").val(hospitalName);\n");
      out.write("                $(\"#workplace\").val(workplace);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
