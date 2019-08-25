package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Inventory Management</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\"\n");
      out.write("  crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- header start --> \n");
      out.write("  <div class=\"navmain\">\n");
      out.write("\n");
      out.write("    <div class=\"columnImage\">\n");
      out.write("      <img src=\"\" width=\"50%\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column50\">\n");
      out.write("      <div class=\"title\">\n");
      out.write("        Ruvini Aqua Plants\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("      <div class=\"search\">\n");
      out.write("        <input class=\"inputSearch\" type=\"text\" placeholder=\"search\">\n");
      out.write("        <button type=\"button\" class=\"buttonSearch\" href=\"\">\n");
      out.write("          <i class=\"fas fa-search\"></i>\n");
      out.write("           <a href=\"Listemployee.jsp\">Search</a>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"topnav\">\n");
      out.write("\n");
      out.write("    <a class=\"active\" href=\"#home\">Admin</a>\n");
      out.write("    <a href=\"#news\">About</a>\n");
      out.write("    <a href=\"#contact\">Contact</a>\n");
      out.write("    <a href=\"#contact\">Updates</a>\n");
      out.write("    <a href=\"#contact\">Package Details</a>\n");
      out.write("\n");
      out.write("    <div class=\"topnav-right\">      <a href=\"index1.jsp\">Sign Up</a>\n");
      out.write("      <a href=\"\">Login</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div> \n");
      out.write("<!-- header end -->\n");
      out.write("  <br> \n");
      out.write("\n");
      out.write("\n");
      out.write("<body background=\"aaa.jpg\">\n");
      out.write("<h2>Inventory Management </h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <form method=\"post\" name=\"resetform\" action=\"index1.jsp\">\n");
      out.write("       \n");
      out.write("\t    \n");
      out.write("\t\t\n");
      out.write("\t\t        <input type=\"submit\" name=\"name\" value=\"Plant Stock\" onclick=\"plant\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<form method=\"post\" name=\"resetform\" action=\"chemical.jsp\">\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"name\" value=\"Chemical Stock\" action=\"plant.html\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("          <form method=\"post\" name=\"resetform\" action=\"equipment.jsp\">\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("                <input type=\"submit\" name=\"name\" value=\"Equipment Stock\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<form method=\"post\" name=\"resetform\" action=\"\">\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"name\" value=\"Re-Order Items\">\n");
      out.write("\n");
      out.write("\n");
      out.write("           </form>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write("\t</center>\t\n");
      out.write("\t\t<br> \n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t<!-- footer start -->\n");
      out.write("\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"columnfooter\">\n");
      out.write("      <span>\n");
      out.write("        <h3>Eventz...</h3>\n");
      out.write("      </span>\n");
      out.write("      <span>\n");
      out.write(" <p>No. 768. <br> Rosemead place,\n");
      out.write("                <br> colombo 3.</p>\n");
      out.write("       \n");
      out.write("      </span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column50footer\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"columnfooterright\">\n");
      out.write("      <span>\n");
      out.write("        <i class=\"fab fa-instagram icons\"></i>\n");
      out.write("        <i class=\"fab fa-facebook-f icons\"></i>\n");
      out.write("        <i class=\"fab fa-twitter icons\"></i>\n");
      out.write("      </span>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("\n");
      out.write("  <!-- footer end -->\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </body>\n");
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
