package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class allocate_005fdoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    // Database connection details
    String dbURL = "jdbc:mysql://localhost:3306/rb";
    String dbUser = "root";
    String dbPass = "";

    Connection conn = null;
    PreparedStatement pst = null;

    // Get parameters from the request
    String doctorId = request.getParameter("doctor_id");
    String appointmentId = request.getParameter("appointment_id");

    // Debugging: Check if parameters are received
    if (doctorId == null || appointmentId == null || doctorId.isEmpty() || appointmentId.isEmpty()) {
        out.println("<script>alert('Error: Missing doctor_id or appointment_id'); window.location='admin_dashboard.jsp';</script>");
        return; // Stop execution
    }

    try {
        // Load JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

        // Update query to allocate a doctor
        String sql = "UPDATE book_appointment SET doctor_id = ?, status = 'allocated' WHERE id = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, doctorId);
        pst.setString(2, appointmentId);

        int rowsUpdated = pst.executeUpdate();

        if (rowsUpdated > 0) {
            out.println("<script>alert('Doctor allocated successfully!'); window.location='admin_dashboard.jsp';</script>");
        } else {
            out.println("<script>alert('Error: Could not allocate doctor. Check appointment ID.'); window.location='admin_dashboard.jsp';</script>");
        }
    } catch (Exception e) {
        out.println("<script>alert('Database Error: " + e.getMessage() + "');</script>");
    } finally {
        // Close resources
        try {
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            out.println("<script>alert('Closing Error: " + e.getMessage() + "');</script>");
        }
    }

      out.write('\n');
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
