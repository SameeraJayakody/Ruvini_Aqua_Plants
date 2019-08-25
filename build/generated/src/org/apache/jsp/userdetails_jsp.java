package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.registeruser;

public final class userdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

registeruser ruser= new registeruser();
String uid= session.getAttribute("ID").toString().trim();
out.print("Dila"+uid);
String detail="" ,col[];
detail= ruser.getuserdetails(uid);

col=detail.split("/");



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Power Re-Create Gym | My Account</title>\n");
      out.write("<link href=\"css3b.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<script>\n");
      out.write("function validateForm(){\n");
      out.write("              var fnameval = document.forms[\"myforms\"][\"fname\"].value;\n");
      out.write("\t\t\t  var lnameval = document.forms[\"myforms\"][\"lname\"].value;\n");
      out.write("\t\t\t  var addressval = document.forms[\"myforms\"][\"address\"].value;\n");
      out.write("\t\t\t  var contactval = document.forms[\"myforms\"][\"contactNumber\"].value;\n");
      out.write("\t\t\t  var emailval = document.forms[\"myforms\"][\"email\"].value;\n");
      out.write("\t\t\t  var birthdayval = document.forms[\"myforms\"][\"birthday\"].value;\n");
      out.write("\t\t\t  var passwordval = document.forms[\"myforms\"][\"password\"].value;\n");
      out.write("\t\t\t  var confirmval = document.forms[\"myforms\"][\"confirmPassword\"].value;\n");
      out.write("              \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  if (fnameval == \"\"){\n");
      out.write("\t\t\t  alert(\"First name must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (lnameval==\"\"){\n");
      out.write("\t\t\t  alert(\"Last name must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (lnameval==\"\"){\n");
      out.write("\t\t\t  alert(\"Last name must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (addressval==\"\"){\n");
      out.write("\t\t\t  alert(\"Address must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (contactval==\"\"){\n");
      out.write("\t\t\t  alert(\"Number must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (emailval ==\"\" ){\n");
      out.write("\t\t\t  alert(\"Email number must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (birthdayval ==\"\" ){\n");
      out.write("\t\t\t  alert(\"Birthday must be filled out\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (passwordval ==\"\" ){\n");
      out.write("\t\t\t  alert(\"The Password column cannot be null\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  else if (passwordval != confirmval ){\n");
      out.write("\t\t\t  alert(\"The two passwords you entered does not match\");\n");
      out.write("\t\t\t  return false;}\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\t  \n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<title> User Account </title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<body background=\"aaa.jpg\">\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("  <h1 class=\"top\">My Profile</h1>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<div></div>\n");
      out.write("\n");
      out.write("<div style=\"margin-left:450px;\" >\n");
      out.write("<div  class=\"container\";\">\n");
      out.write("    <div class=\"col-md-9\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-5\">\n");
      out.write("\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t<img src=\"profpic.jpg\" alt=\"Profile Picture\" height=\"50%\" width=\"50%\">\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-8 col-sm-7\">\n");
      out.write("\t\t\t\t<h2 class=\"userprof\">User Profile</h2>\n");
      out.write("\t\t\t\t<h4>");

                                    out.print(col[0]+" "+col[1]);
                                    
                                    
      out.write("</h4>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\n");
      out.write("\t\t\t\t<ul class=\"icons-list\">\n");
      out.write("\t\t\t\t\n");
      out.write("                                    <form id=\"myforms\" name=\"myforms\"   method=\"post\" action=\"ChangeUser\" >\n");
      out.write("                First Name: <input type=\"text\" name=\"fname\" placeholder=\"ex@John\" value=\"");
out.print(col[0]);   
      out.write("\" maxlength=\"50\" />\n");
      out.write("\t\t<br />\n");
      out.write("\t\tLast Name: <input type=\"text\" name=\"lname\"  value=\"");
out.print(col[1]);   
      out.write("\" placeholder=\"ex@Stephson\" maxlength=\"50\"/>\n");
      out.write("\t\t<br />\n");
      out.write("\t\tAddress: <input type=\"text\" name=\"address\" value=\"");
out.print(col[3]);   
      out.write("\" placeholder=\"ex@BOC Merchant Tower,St Michaels Rd, Colombo\" maxlength=\"100\"/>\n");
      out.write("\t\t<br />\n");
      out.write("\t\tContact Number: <input type=\"tel\" name=\"tele\" placeholder=\"07* *** ****\" pattern=\"[0-9]{10}\" value=\"");
out.print(col[5]);   
      out.write("\" required  maxlength=\"15\"/>\n");
      out.write("\t\t<!-- type changed from \"text\" to \"tel\" because input must be a numeric value -->\n");
      out.write("\t\t<!-- with the [pattern=\"[0-9]{10}\"] tag it validates only for 10 numbers -->\n");
      out.write("\t\t<!-- with the [required] tag border of the TextBox will be red color until it validates -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<br />\n");
      out.write("\t\tE-mail: <input type=\"email\" name=\"mail\" placeholder=\"mail@example.com\" value=\"");
out.print(col[2]);   
      out.write("\" required maxlength=\"100\"/>\n");
      out.write("\t\t<!-- type changed from \"text\" to \"email\" because input value must be a email adrress -->\n");
      out.write("\t\t<!-- with the [required] tag border of the TextBox will be red color until it validates -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\t\n");
      out.write("\t\tDate of Birth: <input type=\"text\" name=\"birth\" value=\"");
out.print(col[4]);   
      out.write("\" placeholder=\"DD/MM/YYYY\" maxlength=\"15\"/>\n");
      out.write("\t\t<!-- type changed from \"text\" to \"date\" because input type is date -->\n");
      out.write("\t\t<!-- with this change user doesnt have to input the date by typing -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\tUsername: <input type=\"text\" name=\"uname\" value=\"");
out.print(col[6]);   
      out.write("\" placeholder=\"username\" maxlength=\"50\"/>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t Password: <input type=\"password\" name=\"pass\" value=\"");
out.print(col[7]);   
      out.write("\" placeholder=\"***********\" maxlength=\"50\"/>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<input type=\"radio\" name=\"privacy\"/> I have read and agree to the privacy policy \n");
      out.write("\t\t<br /><br />\n");
      out.write("\t\t<input type=\"submit\" name=\"submit\" onClick=\"validateForm()\" value=\"Update\">\n");
      out.write("                <br> <br> <br>\n");
      out.write("                <input type=\"submit\" name=\"submit\"  onClick=\"validateForm()\" value=\"Delete\">\n");
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\t \t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("                   \n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>                                                            \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
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
