
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/ruvinidb";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String id = request.getParameter("pid");
String name=request.getParameter("pname");
String qu=request.getParameter("quant");
String pri=request.getParameter("price");
String da=request.getParameter("trip-start");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update plantstock set plantcode=?,plantname=?,quantity=?,price=?,date=? where plantcode="+personID;
ps = con.prepareStatement(sql);
ps.setString(1, plantcode);
ps.setString(2, plantname);
ps.setString(3, quantity);
ps.setString(4, price);
ps.setString(5, date);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>