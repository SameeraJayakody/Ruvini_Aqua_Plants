package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Employee;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel = \"stylesheet\"\n");
      out.write("   type = \"text/css\"\n");
      out.write("   href = \"Employee.css\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>EVENTZ Employee Management</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h3>List of Employees</h3>\n");
      out.write("\t\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t  <div align=\"left\">\n");
      out.write("\t\t<table border=\"1\" cellpadding=\"12\">\n");
      out.write("\t\t <caption><h2>List of Employees</h2></caption>\n");
      out.write("\t\t <a href=\"index.jsp\">Add Employee</a>\n");
      out.write("\t\t  <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>NIC</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Department</th>\n");
      out.write("                <th>Contacts</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Select</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

            
			 Employee emp = new Employee();
			
			
			
      out.write("\n");
      out.write("\t\t\t <tr>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getEmployeeID() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getNIC() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getName() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getDepartment() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getContactNumber() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getDepartment() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getAddress() );
      out.write(" </td>\n");
      out.write("\t\t\t\t<td> ");
      out.print(emp.getGender() );
      out.write(" </td>\t\n");
      out.write("\t\t\t\t<td> \n");
      out.write("\t\t\t\t<form method=\"POST\" action=\"GetEmployeeServlet\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"employeeID\" value=\"");
      out.print(employee.getEmployeeID());
      out.write("\"/>\n");
      out.write("\t\t\t\t <input type=\"submit\" value= \"Select Employee\" class=\"select-button\" /> \n");
      out.write("\t\t\t\t </form>\n");
      out.write("\t\t\t\t </td>\t\n");
      out.write("\t\t\t\t</tr>\t\t\t\n");
      out.write("\t\t\t");
	
			   }
            
      out.write("     \n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
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
