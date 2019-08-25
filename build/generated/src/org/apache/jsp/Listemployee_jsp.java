package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Listemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td, th {\r\n");
      out.write("  border: 1px solid #dddddd;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("a[type=submit] {\r\n");
      out.write(" width: 75%;\r\n");
      out.write(" background-color: rgb(243, 36, 71);\r\n");
      out.write(" color: white;\r\n");
      out.write(" padding: 8px 15px;\r\n");
      out.write(" margin: 20px 0;\r\n");
      out.write(" border: none;\r\n");
      out.write(" border-radius: 10px;\r\n");
      out.write(" cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<body background=\"qqq.jpg\">\r\n");
      out.write("<h2>Employee Table</h2>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("      \r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("\t\t\t<th>NIC</th>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>Department</th>\r\n");
      out.write("                        <th>Contacts</th>\r\n");
      out.write("                        <th>Address</th>\r\n");
      out.write("                        <th>Gender</th>\r\n");
      out.write("                          <th>Update</th>\r\n");
      out.write("                            <th>Delete</th>\r\n");
      out.write("                        \r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tbody>\r\n");
      out.write("\t");
   Connection con;
	    Statement st;
	    ResultSet rs;
	   
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\t   ");
 
	   String url,user,pass;
	   
	   
	       url="jdbc:mysql://localhost/manageemployee";//dbname
	       user="root";
	       pass="";
               
	      try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con=DriverManager.getConnection(url,user,pass);
	             
	                String data="select * from employee ";
			st=con.createStatement();
			rs= st.executeQuery(data);
			while (rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString("ID")+"</td>");
			out.print("<td>"+rs.getString("NIC")+"</td>");
			out.print("<td>"+rs.getString("Name")+"</td>");
			out.print("<td>"+rs.getString("Department")+"</td>");
			out.print("<td>"+rs.getString("Contacts")+"</td>");
			out.print("<td>"+rs.getString("Address")+"</td>");
                        out.print("<td>"+rs.getString("Gender")+"</td>");
                        
			out.print("<td class=\"text-center\"><a href =\"index.jsp?u="+rs.getString("ID")+"\" class = \"btn btn-warning\"> Edit </a></td><td><a href =\"delete?u=" +rs.getString("ID")+" \"class =\"btn btn-danger \"> Delete </a></td>");
			out.print("</tr>");
			
			}
                        
		}catch(Exception ex){
                    
			out.print(""+ex);
                        
		}
		
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</table>\r\n");
      out.write("                <pre>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                                                  <a href=\"index.jsp\" type=\"submit\">Back</a></pre>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
